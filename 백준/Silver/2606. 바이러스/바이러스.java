import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int answer = 0;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    
    public static void dfs(int idx) {
        visited[idx] = true;
        answer++;
        for(int i = 0; i < graph[idx].size(); i++) {
            if(!visited[graph[idx].get(i)]) {

                dfs(graph[idx].get(i));   
            }
        }

    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        
        visited = new boolean[N+1];
        graph = new ArrayList[N+1];

        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();            
        }
        
        for(int i = 0; i < M; i++) {
             StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            graph[x].add(y);
            graph[y].add(x);
        }
        
        dfs(1);
        
        System.out.println(answer - 1);
        

    }
}