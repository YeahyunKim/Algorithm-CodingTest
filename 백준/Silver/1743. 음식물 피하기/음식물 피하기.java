import java.util.*;

public class Main {
    static boolean[][] map;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};
    static int count = 1;
    static int H, W;
    
    public static void dfs(int y, int x) {
        map[y][x] = false;
        
        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            
            if(newY >= 0 && newX >= 0 && newY < H && newX < W && map[newY][newX]) {
                count++;
                dfs(newY, newX);
           }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        H = input.nextInt();
        W = input.nextInt();
        int C = input.nextInt();
        
        map = new boolean[H][W];
        
        for(int i = 0; i < C; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            
            map[x-1][y-1] = true;
        }
        int res = 0;
        
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
               if(map[i][j]) {
                   dfs(i, j);
                   res = Math.max(count, res);
                   count = 1;
               } 
            }
        }
        
        System.out.println(res);
    }
}