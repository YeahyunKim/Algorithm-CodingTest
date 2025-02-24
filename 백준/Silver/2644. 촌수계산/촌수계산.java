import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N, A, B, M;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int depth = 0;

    public static void dfs(int idx, int end, int count) {
        visited[idx] = true;
        if(idx == end) {
            depth = count;
            return;
        }

        for(int i = 0; i < graph[idx].size(); i++) {
            if(!visited[graph[idx].get(i)]) {
                dfs(graph[idx].get(i), end, count+1);
            }
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        A = input.nextInt();
        B = input.nextInt();
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

        dfs(A, B, 0);
        
        if(A == B) {
            System.out.println(0);
        } else {
            System.out.println(depth == 0 ? -1 : depth);
        }


    }
}
