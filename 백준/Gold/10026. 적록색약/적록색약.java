import java.util.*;

public class Main {
    static int N;
    static boolean[][] visited;
    static String[][] map;
    static int[] dirY = {1, -1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};

    public static void dfsColorBlindness(int y, int x, String s) {
        visited[y][x] = true;

        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

                    if(newY >= 0 && newX >= 0 && newY < N && newX < N) {
                        if(!s.equals("B")) {
                            if (!visited[newY][newX] && !map[newY][newX].equals("B")) {
                                dfsColorBlindness(newY, newX, map[newY][newX]);
                            }
                        } else {
                            if (!visited[newY][newX] && map[newY][newX].equals("B")) {
                                dfsColorBlindness(newY, newX, map[newY][newX]);
                            }
                        }

                    }

        }
    }

    public static void dfs(int y, int x, String s) {
        visited[y][x] = true;

        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if(newY >= 0 && newX >= 0 && newY < N && newX < N) {
                if (!visited[newY][newX] && map[newY][newX].equals(s)) {
                    dfs(newY, newX, map[newY][newX]);
                }
            }

        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int colorBlindnessArea = 0;
        int area = 0;

        N = input.nextInt();
        input.nextLine();

        map = new String[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            String[] s = input.nextLine().split("");

            for(int j = 0; j < s.length; j++) {
                map[i][j] = s[j];
            }
        }

        for(int y = 0; y < N; y++) {
            for(int x = 0; x < N; x++) {
                if(!visited[y][x]) {
                    dfsColorBlindness(y, x, map[y][x]);
                    colorBlindnessArea++;
                }
            }
        }

        visited = new boolean[N][N];
        for(int y = 0; y < N; y++) {
            for(int x = 0; x < N; x++) {
                if(!visited[y][x]) {
                    dfs(y, x, map[y][x]);
                    area++;
                }
            }
        }

        System.out.println(area + " " + colorBlindnessArea);

    }
}