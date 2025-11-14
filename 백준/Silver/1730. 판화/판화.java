import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();
        
        char[][] map = new char[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                map[i][j] = '.';
            }
        }
        
        String LOCATION = input.nextLine();

        int y = 0;
        int x = 0;
        for(char l : LOCATION.toCharArray()) {
            int newY = y;
            int newX = x;
            if(l == 'D') newY += 1;
            else if(l == 'U') newY -= 1;
            else if(l == 'R') newX += 1;
            else if(l == 'L') newX -= 1;
            
            if(newY < N && newX < N && newY >=0 && newX >= 0) {
                changeMap(map, l, y, x, newY, newX);   
                y = newY;
                x = newX;
            }

        }
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }   
    public static void changeMap(char[][] map, char location, int y, int x, int y2, int x2) {
        if(location == 'D' || location == 'U') {
            if(map[y][x] == '.') map[y][x] = '|';
            else if(map[y][x] == '-') map[y][x] = '+';
            
            if(map[y2][x2] == '.') map[y2][x2] = '|';
            else if(map[y2][x2] == '-') map[y2][x2] = '+';
        }    
        
        if(location == 'R' || location == 'L') {
            if(map[y][x] == '.') map[y][x] = '-';
            else if(map[y][x] == '|') map[y][x] = '+';
            
            if(map[y2][x2] == '.') map[y2][x2] = '-';
            else if(map[y2][x2] == '|') map[y2][x2] = '+';
        }
    }
}