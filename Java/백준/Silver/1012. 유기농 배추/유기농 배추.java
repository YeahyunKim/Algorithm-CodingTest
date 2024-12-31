import java.util.*;

public class Main {
    static int T, W, H, C;
    static boolean[][] map;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};
    
    public static void dfs(int y, int x) {
        map[y][x] = false;
        
        for(int i = 0; i < 4; i++) {
          int newY = y + dirY[i];
          int newX = x + dirX[i];
          
          if(map[newY][newX]) {
              dfs(newY, newX);
          }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        T = input.nextInt();
        
        for(int k = 0; k < T; k++) {
            int answer = 0;
            W = input.nextInt();
            H = input.nextInt();
            C = input.nextInt();
            
            map = new boolean[H+2][W+2];
            
            for(int i = 1; i <= C; i++) {
                int x = input.nextInt() +1;
                int y = input.nextInt() +1;
                
                map[y][x] = true;
            }
            
            for(int i = 1; i <=H; i++) {
                for(int j = 1; j <= W; j++) {
                    if(map[i][j]) {
                        answer++;
                        dfs(i, j);   
                    }
                }
            }
            System.out.println(answer);
        }
    }
}