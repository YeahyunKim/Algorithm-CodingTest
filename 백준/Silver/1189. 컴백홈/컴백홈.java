import java.util.*;

public class Main {
    static int H,W,K;
    static String[][] map;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};
    static int count = 0;

    public static void dfs(int y, int x, int depth) {
        map[y][x] = "s";
        if(depth > K) {
            return;
        }
        if(y == 0 && x == W-1 && depth == K) {
            count++;
            return;
        }

        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if(newY >= 0 && newX >= 0 && newY < H && newX < W && map[newY][newX].equals(".")) {
                dfs(newY, newX, depth+1);
                map[newY][newX] = ".";
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        H = input.nextInt();
        W = input.nextInt();
        K = input.nextInt();
        map = new String[H][W];
        input.nextLine();

        for(int i = 0; i < H; i++) {
            String[] str = input.nextLine().split("");
            for(int j = 0; j < str.length; j++) {
                map[i][j] = str[j];
            }
        }

        dfs(H-1, 0, 1);

        System.out.println(count);

    }
}