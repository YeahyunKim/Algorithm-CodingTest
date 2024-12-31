import java.util.*;

public class Main {
    static int N;
    static ArrayList<Integer>[] graph;
    static ArrayList<Integer> answer = new ArrayList<>();

    static HashSet<Integer> hashSet = new HashSet<>();
    static boolean[] visited;
    static int circuit = 0;
    static int single = 0;

    public static void dfs(int idx, int startNode, LinkedList<Integer> s) {
        visited[idx] = true;

        for(int next : graph[idx]) {
            if(!visited[next]) {
                s.add(next);
                dfs(next, startNode, s);
                s.removeLast();
            } else {
                if(next == startNode) {
                    answer = new ArrayList<>(s);
                    return;
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        graph = new ArrayList[N+1];

        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 1; i <= N; i++) {
            int x = input.nextInt();
            graph[i].add(x);
        }
        for(int i = 1; i <= N; i++) {
            visited = new boolean[N+1];
            if(!visited[i] && graph[i].size() > 0) {
                LinkedList<Integer> s = new LinkedList<>();
                s.add(i);
                dfs(i, i, s);
            }

            for(int n : answer) {
                hashSet.add(n);
            }
        }
        System.out.println(hashSet.size());
        answer = new ArrayList<>(hashSet);
        Collections.sort(answer);
        for(int n : answer) {
            System.out.println(n);
        }
    }
}

