import java.util.*;

public class Main {
    static int N, M, R;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] answer;
    static int order = 1;
    
    
    public static void dfs(int idx) {
        visited[idx] = true;
        answer[idx] = order++;
        
        for(int i = 0; i < graph[idx].size(); i++) {
            if(!visited[graph[idx].get(i)]) {
                dfs(graph[idx].get(i));
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        N = input.nextInt(); //노드개수
        M = input.nextInt(); //간선개수
        R = input.nextInt(); //시작정점
        
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        answer = new int[N+1];
        
        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < M; i++) {
            // 5개의 간선을 넣어주기
            int x = input.nextInt();
            int y = input.nextInt();
            
            graph[x].add(y);
            graph[y].add(x);
        }
        
        for(int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        
        dfs(R);
        
        for(int i = 1; i <= N; i++) {
            System.out.println(answer[i]);
        }
        
    }
}