import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
        static int N, M, R;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int[] depthArray;

    public static void dfs(int idx, int depth) {
        visited[idx] = true;
        depthArray[idx] = depth;

        for (int neighbor : graph[idx]) {
            if (!visited[neighbor]) {
                dfs(neighbor, depth + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();
        R = input.nextInt();

        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];
        depthArray = new int[N + 1];
        Arrays.fill(depthArray, -1);

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }

        for (int i = 1; i < graph.length; i++) {
            Collections.sort(graph[i]);
        }

        dfs(R, 0); // depth를 0으로 시작

        for (int i = 1; i < depthArray.length; i++) {
            System.out.println(depthArray[i]);
        }
    }
}