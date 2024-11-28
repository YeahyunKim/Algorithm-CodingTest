import java.util.*;

public class Main {
    static boolean[][] visited;
    static int[][] graph;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};
    
    public static void dfs(int y, int x, int deep) {
        visited[y][x] = true;
        
        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            
            if(!visited[newY][newX] && graph[newY][newX] > deep)
                dfs(newY, newX, deep);
        }
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        graph = new int[N+2][N+2];
        int max = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int x = input.nextInt();
                graph[i+1][j+1] = x;
                if(max < x) {
                    max = x;
                }
            }
        }
        
        int res = 0;
        int count = 0;

        for(int m = 0; m <= max; m++) {
            visited = new boolean[N+2][N+2];
            
            for(int i = 1; i <= N; i++) {
                 for(int j = 1; j <= N; j++) {
                    if(!visited[i][j] && graph[i][j] > m) {
                        dfs(i, j, m);
                        count++;
                    }
                }   
            }
            res = Math.max(count, res);
            count = 0;
        }
        System.out.println(res);
        
    }
}