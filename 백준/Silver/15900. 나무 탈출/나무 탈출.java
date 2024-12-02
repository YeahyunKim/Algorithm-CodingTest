import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {
    static int N;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int forAnswer = 0;
    public static void dfs(int idx, int parent, int depth) {
        visited[idx] = true;

        if(graph[idx].size() == 1 && graph[idx].get(0) == parent) {
            forAnswer += depth;
            return;
        }
        for(int i = 0; i < graph[idx].size(); i++) {
            if(!visited[graph[idx].get(i)]) {
                dfs(graph[idx].get(i), idx, depth+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());

        graph = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        StringTokenizer st;
        for(int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1, -1, 0);

        if(forAnswer % 2 == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}