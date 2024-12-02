import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dirY = {1, 0};
    static int[] dirX = {0, 1};


    public static void dfs(int y, int x) {
        visited[y][x] = true;
        if(map[y][x] == -1) {
            return;
        }
        
        for(int i = 0; i < 2; i++) {
            int newY = y + dirY[i] * map[y][x];
            int newX = x + dirX[i] * map[y][x];
            if(newY < N && newX < N && !visited[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        visited = new boolean[N][N];
        map = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int x = input.nextInt();

                map[i][j] = x;
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