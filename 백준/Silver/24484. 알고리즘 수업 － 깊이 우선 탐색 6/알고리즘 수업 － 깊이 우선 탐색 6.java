import java.util.*;

public class Main{
    static int N,M,R;
    static int[] depthArray;
    static int[] orderArray;
    static int order = 1;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    
    public static void dfs(int idx, int depth) {
        visited[idx] = true;
        depthArray[idx] = depth;
        orderArray[idx] = order;
        order++;
        
        for(int num : graph[idx]) {
            if(!visited[num]) {
                dfs(num, depth + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        long sum = 0;
        
        Scanner input = new Scanner(System.in);
        
        N = input.nextInt();
        M = input.nextInt();
        R = input.nextInt();
        
        
        depthArray = new int[N+1];
        Arrays.fill(depthArray, -1);
        
        orderArray = new int[N+1];
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
            Collections.sort(graph[i], Collections.reverseOrder());
        }
        
        dfs(R, 0);
        
        for(int i = 1; i <= N; i++) {
            sum += (long) depthArray[i] * orderArray[i];
        }
        
        System.out.println(sum);
    }
}