package org.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class 나무탈출_15900 {
    static ArrayList<Integer>[] graph;
    static int N;
    static boolean[] visited;
    static int answer = 0;

    public static void dfs(int idx, int parent, int depth) {

        visited[idx] = true;

        if(graph[idx].size() == 1 && graph[idx].get(0) == parent) {
            answer += depth;
            return;
        }

        for(int i = 0; i < graph[idx].size(); i++) {
            if(!visited[graph[idx].get(i)]) {
                dfs(graph[idx].get(i), idx, depth+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        graph = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < N-1; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1, -1, 0);

        if(answer % 2 == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}
