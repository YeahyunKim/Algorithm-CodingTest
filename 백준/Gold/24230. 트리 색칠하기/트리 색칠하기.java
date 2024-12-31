
import java.util.*;

public class Main {
    static int N;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static int[] list;
    static int[] colorList;
    static int count = 0;
    public static void dfs(int idx, int color) {
        visited[idx] = true;
//        list[idx] = color;

        for(int next : graph[idx]) {
            if(!visited[next]) {

                if(colorList[next] != color) {
                    count++;
                    dfs(next, colorList[next]);
                } else {
                    dfs(next, color);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        colorList = new int[N+1];
        list = new int[N+1];
        visited = new boolean[N+1];


        graph = new ArrayList[N+1];

        for(int i = 1; i <= N; i++) {
            int x = input.nextInt();
            colorList[i] = x;
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < colorList.length; i++) {
            if(colorList[i] == 0) {
                visited[i] = true;
            }
        }

        for(int i = 0; i < N-1; i++) {
            int x = input.nextInt();
            int y = input.nextInt();

            graph[x].add(y);
            graph[y].add(x);
        }


        for(int i = 1; i <= N; i++) {
            if(colorList[i] != 0 && !visited[i]) {
                count++;
                dfs(i, colorList[i]);
            }
        }


        System.out.println(count);
    }
}