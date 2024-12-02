import java.util.*;

public class Main {
    static int[][] map;
    static int H, W;
    static int[] dirY = {-1, 1, 0, 0, 1, 1, -1, -1};
    static int[] dirX = {0, 0, 1, -1, 1, -1, 1, -1};
    
    public static void dfs(int y, int x) {
        map[y][x] = 0;
        
        for(int i = 0; i < 8; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if(newY >= 0 && newX >= 0 && newY < H && newX < W && map[newY][newX] == 1) {
                dfs(newY, newX);
            }
        }
    }
    
    public static void main(String[] args) {
        int count = 0;
        
        Scanner input = new Scanner(System.in);
        
        H = input.nextInt();
        W = input.nextInt();
        
        map = new int[H][W];
        
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                int x = input.nextInt();
                
                map[i][j] = x;
            }
        }
        
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if(map[i][j] == 1) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
            
    }
}