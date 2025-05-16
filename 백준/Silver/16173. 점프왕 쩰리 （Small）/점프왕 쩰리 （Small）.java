import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dirY = {1, 0};
    static int[] dirX = {0, 1};

    public static void dfs(int y, int x) {
        visited[y][x] = true;
        if(y == N-1 && x == N-1) {
            return;
        }

        for(int i = 0; i < 2; i++) {
            int newY = dirY[i] * graph[y][x] + y;
            int newX = dirX[i] * graph[y][x] + x;

            if(newY < N && newX < N) {
                if(!visited[newY][newX]) {
                    dfs(newY, newX);
                }
            }
        }
    }


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        graph = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int a = input.nextInt();
                graph[i][j] = a;
            }
        }

        dfs(0, 0);

        if(visited[N-1][N-1] == true) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }

    }
}
