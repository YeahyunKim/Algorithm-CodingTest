import java.util.Scanner;

public class Main{
    static int N, M;
    static int answer;
    static boolean graph[][];
    static boolean visited[];
    
    public static void dfs(int idx) {
        visited[idx] = true;

        for(int i = 1; i <= N; i++) {
            if(!visited[i] && graph[idx][i])
                dfs(i);
        }        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        M = input.nextInt();
        
        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];

        int x, y;
        for(int i = 0; i < M; i++) {
            x = input.nextInt();
            y = input.nextInt();
            graph[x][y] = true;
            graph[y][x] = true;
        }

        for(int i = 1; i < visited.length; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }            
        }
        System.out.println(answer);

    }
}