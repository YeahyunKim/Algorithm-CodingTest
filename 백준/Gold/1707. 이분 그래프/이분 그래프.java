import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static ArrayList<Integer> colorList = new ArrayList<>();
    static boolean[] visited;
    static String[] color;
    static int count = 0;
    static boolean isGraph = true;

    public static void dfs(int idx, int depth) {
        count++;
        visited[idx] = true;

        if(depth % 2 == 0) {
            color[idx] = "blue";
        } else {
            color[idx] = "red";
        }

        for(int next : graph[idx]) {
            if(!visited[next] && color[next].equals("0")) {
                dfs(next, depth+1);
            } else {
                if(color[next].equals(color[idx])) {
                    isGraph = false;
                }
            }
        }

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int K = input.nextInt();

        for(int k = 0; k < K; k++) {
            int N = input.nextInt();
            int M = input.nextInt();
            isGraph = true;
            graph = new ArrayList[N+1];
            visited = new boolean[N+1];
            color = new String[N+1];
            Arrays.fill(color, "0");

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
                if(!visited[i]) {
                    dfs(i, 0);
                }
            }
            System.out.println(isGraph ? "YES" : "NO");
        }
        input.close();
    }
}