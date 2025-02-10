import java.util.*;

public class 음식물피하기_1743 {
    static int H, W, C;
    static int[] dirY = {1, -1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};
    static boolean[][] map;
    static int count = 1;

    public static void dfs(int y, int x) {
        map[y][x] = false;

        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if(newY < H && newX < W && newY >= 0 && newX >= 0 && map[newY][newX]) {
                dfs(newY, newX);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        H = input.nextInt();
        W = input.nextInt();
        C = input.nextInt();

        map = new boolean[H][W];

        for(int i = 0; i < C; i++) {
            int y = input.nextInt();
            int x = input.nextInt();
            map[y-1][x-1] = true;
        }

        int answer = 0;

        for(int h = 0; h < H; h++) {
            for(int w = 0; w < W; w++) {
                if(map[h][w]) {
                    dfs(h, w);
                    answer = Math.max(answer, count);
                    count = 1;
                }
            }
        }
        System.out.println(answer);

    }
}