import java.util.*;

public class Main {
    static int N, M;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int answer = 0;
    
    public static void dfs(int idx, int depth) {
        if(depth == 5) {
            answer = 1;
            return;
        }
        
        visited[idx] = true;
        
        for(int i = 0; i < graph[idx].size(); i++) {
            if(!visited[graph[idx].get(i)]) {
                dfs(graph[idx].get(i), depth+1);
            }
        }
        visited[idx] = false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        N = input.nextInt();
        M = input.nextInt();
        
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i< M; i++) {
            int x = input.nextInt() + 1;
            int y = input.nextInt() + 1;
            graph[x].add(y);
            graph[y].add(x);
        }
        
        for(int i = 1; i <= N; i++) {
            if(answer == 0) {
                dfs(i, 1);                
            }
        }
        
         if(answer == 1) {
             System.out.println(1);
         } else {
             System.out.println(0);
         }
    }
}