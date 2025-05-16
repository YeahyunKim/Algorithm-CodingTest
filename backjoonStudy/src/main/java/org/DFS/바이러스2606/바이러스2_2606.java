package org.DFS.바이러스2606;
import java.util.*;

public class 바이러스2_2606 {
    static int N, M;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int answer = 0;

    public static void dfs(int idx) {
        visited[idx] = true;
        answer++;

        for(int i = 0; i < graph[idx].size(); i++) {
            if(!visited[graph[idx].get(i)]) {
                dfs(graph[idx].get(i));
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();


        graph = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);

        System.out.println(answer - 1);

    }
}
