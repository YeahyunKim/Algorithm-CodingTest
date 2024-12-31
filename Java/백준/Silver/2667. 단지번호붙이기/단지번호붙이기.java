import java.util.*;

public class Main {
    static int T;
    static boolean[][] map;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};
    static int test = 1;

    
    public static void dfs(int y, int x) {

        map[y][x] = false;
        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            
            if(map[newY][newX]) {
                test++;
                dfs(newY, newX);
            }
              
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        T = input.nextInt();
        int count = 0;
        
        map = new boolean[T+2][T+2];
        
        for(int i = 1; i <= T; i++) {
            String[] str = input.next().split("");
            
            for(int j = 0; j < str.length; j++){
                if(str[j].equals("1")) {
                     map[i][j+1] = true;  
                }                 
            }
        }

        for(int i = 1; i <= T; i++) {
            for(int j = 1; j <= T; j++) {
                if(map[i][j]) {
                    count++;
                    dfs(i, j);
                    arrayList.add(test);
                    test = 1;
                }
            }
        }

        System.out.println(count);
        
        Collections.sort(arrayList);
        
        for(int num : arrayList) {
            System.out.println(num);
        }
        
            
            
        
    }
}