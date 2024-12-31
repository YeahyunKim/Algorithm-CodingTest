import java.util.*;

public class Main {
    static int N, M, R;
    static int[] answer;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int order = 1;
    
    public static void dfs(int idx) {
        visited[idx] = true;
        answer[idx] = order;
        order++;
        
        for(int i = 0; i < graph[idx].size(); i++) {
            if(!visited[graph[idx].get(i)])
               dfs(graph[idx].get(i));  
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        N = input.nextInt();
        M = input.nextInt();
        R = input.nextInt();
        
        answer = new int[N+1];
        visited = new boolean[N+1];
        graph = new ArrayList[N+1];
                
        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < M; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }
        
        for(int i = 1; i < graph.length; i++) {
            Collections.sort(graph[i], Collections.reverseOrder());
        }
        
        dfs(R);
        
        for(int i = 1; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        
    }
}