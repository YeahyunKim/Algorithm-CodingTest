import java.util.*;

public class Main {
    static int W, H;
    static boolean[][] graph;
    static int[] dirY = {1, -1, 0, 0, -1, -1, 1, 1};
    static int[] dirX = {0, 0, 1, -1, -1, 1, -1, 1};
        
    
    public static void dfs(int y, int x) {
        graph[y][x] = false;
        
        for(int i = 0; i < dirY.length; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            
            if(graph[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }
    
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        
         while (true) {
            int answer = 0;
             W = input.nextInt();
             H = input.nextInt();
             
             
             if(W == 0 && H == 0) {
                 break;
             }
        
            graph = new boolean[H+2][W+2];
            
                
            for(int i = 1; i<= H; i++) {
                for(int j = 1; j <= W; j++) {
                    int x = input.nextInt();
                    if(x == 1) {
                        graph[i][j] = true;   
                    }
                }
            }
             
            for(int i = 1; i<= H; i++) {
                for(int j = 1; j <= W; j++) {
                    if(graph[i][j]) {
                        answer++;
                        dfs(i, j);        
                    }
                }
            }
             
             System.out.println(answer);
         } 
    }
}