import java.util.*;

public class Main {
    static String[][] map;
    static boolean[][] visited;
    static int[] dirY = {1};
    static int[] dirX = {1};
    static int N, M;

    public static void dfs(int y, int x, String a) {
        visited[y][x] = true;

        int newY = y + 1;
        int newX = x + 1;

        if(a.equals("-")) {
            if(newX < M && map[y][newX].equals("-")) {
                dfs(y, newX, map[y][newX]);
            }
        }

        if(a.equals("|")) {
            if(newY < N && map[newY][x].equals("|")) {
                dfs(newY, x, map[newY][x]);
            }
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int answer = 0;

        N = input.nextInt();
        M = input.nextInt();
        input.nextLine();

        map = new String[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            String[] a = input.nextLine().split("");
            for(int j = 0; j < M; j++) {

                map[i][j] = a[j];
            }
        }


        for(int y = 0; y < N; y++) {
            for(int x = 0; x < M; x++) {
                if(!visited[y][x]){
                    dfs(y, x, map[y][x]);
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
