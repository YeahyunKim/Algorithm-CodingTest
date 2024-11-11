import java.util.*;

public class Main {
    static int N, M, R;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static Queue<Integer> queue;
    
    public static void dfs(int idx) {
        System.out.print(idx + " ");
        visited[idx] = true;
        
        for(int i = 0; i < graph[idx].size(); i++) {
            if(!visited[graph[idx].get(i)]) {
                dfs(graph[idx].get(i));
            }
        }    
    }
    
    public static void bfs(int idx) {
        visited = new boolean[N+1];
        queue = new LinkedList<>();
        
        queue.add(idx);
        visited[idx] = true;
        
        while(!queue.isEmpty()) {
            int index = queue.poll();
            System.out.print(index + " ");
            
            for(int i = 0; i < graph[index].size(); i++) {
                if(!visited[graph[index].get(i)]) {
                     visited[graph[index].get(i)] = true;
                     queue.add(graph[index].get(i));
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        N = input.nextInt();
        M = input.nextInt();
        R = input.nextInt();
        
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        
        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < M; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            
            graph[x].add(y);
            graph[y].add(x);
        }
        
        for(int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        
        dfs(R);
        System.out.println();
        bfs(R);
    }
}