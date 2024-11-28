import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] parents;
    
    
    public static void dfs(int idx) {
        visited[idx] = true;
        
        for(int i : graph[idx]) {
            if(!visited[i]) {
                parents[i] = idx;
                dfs(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        graph = new ArrayList[N+1];
        parents = new int[N+1];
        visited = new boolean[N+1];
        
        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 1; i < N; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            
            graph[x].add(y);
            graph[y].add(x);
        }
        
        dfs(1);

        
        for(int i = 2; i <= N; i++) {
            System.out.println(parents[i]);
        }
    }
}