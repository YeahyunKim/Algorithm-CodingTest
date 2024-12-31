import java.util.*;

public class Main {
    static boolean[][] map;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};
    static int photoSize = 0;
    
    public static void dfs(int y, int x) {
        map[y][x] = false;
        photoSize++;
        
        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            
            if(map[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int count = 0;
        int H = input.nextInt();
        int W = input.nextInt();
        
        map = new boolean[H+2][W+2];
        
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                int x = input.nextInt();
                
                if(x == 1) {
                    map[i+1][j+1] = true;
                }
            }
        }
        
        int res = 0;
        for(int i = 1; i <= H; i++) {

            for(int j = 1; j <= W; j++) {
                if(map[i][j]) {
                    dfs(i, j);
                    res = Math.max(photoSize, res);
                    photoSize = 0;
                    count++;
                }
            }

        }
        
        System.out.println(count);
        System.out.println(res);
    }
}