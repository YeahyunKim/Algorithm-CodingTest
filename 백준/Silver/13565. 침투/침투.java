import java.util.*;

public class Main{
    static int H, W;
    static boolean[][] map;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};
    static boolean isReached = false;
    
    public static void dfs(int y, int x){
        map[y][x] = false;
        
        if(y == H-1) {
            isReached = true;
            return;
        }
        
        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            
            if(newY >= 0 && newX >= 0 && newY < H && newX < W && map[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        H = input.nextInt();
        W = input.nextInt();
        input.nextLine();
        
        map = new boolean[H][W];
        
        for(int i = 0; i < H; i++) {
            String[] str = input.nextLine().split("");
            for(int j = 0; j < str.length; j++) {
                if(str[j].equals("0")) {
                 map[i][j] = true;
                }
            }
        }
        
        for(int x = 0; x < W; x++) {
            if(map[0][x]) {
                dfs(0, x);
            }
        }
        
        if(isReached) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}