import java.util.*;

public class Main {
    static int H, W;
    static int[][] map1;
    static int[][] map2;
    static boolean[][] visited;
    static int[] dirY = {1, -1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};


    public static void dfs(int y, int x, int startNum, int changeNum) {
            map1[y][x] = changeNum;

            for(int i = 0; i < 4; i++) {
                int newY = y + dirY[i];
                int newX = x + dirX[i];

                if(newY >= 0 && newX >= 0 && newY < H && newX < W) {
                    if(map1[newY][newX] == startNum) {
                        dfs(newY, newX, startNum, changeNum);
                    }
                }
            }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        H = input.nextInt();
        W = input.nextInt();

        map1 = new int[H][W];
        map2 = new int[H][W];
        visited = new boolean[H][W];

        for(int k = 0; k < 2; k++) {
            for(int h = 0; h < H; h++) {
                for(int w = 0; w < W; w++) {
                    int x = input.nextInt();
                    if(k == 0) {
                        map1[h][w] = x;
                    } else {
                        map2[h][w] = x;
                    }
                }
            }
        }
        boolean isSame = false;
        boolean isChanged = false;

        for(int h = 0; h < H; h++) {
            if(isChanged)
                break;
            for(int w = 0; w < W; w++) {
                if(map1[h][w] != map2[h][w]) {
                    dfs(h, w, map1[h][w], map2[h][w]);
                    isChanged = true;
                    break;
                }
            }
        }

        System.out.println(areArraysEqual(map1, map2) ? "YES" : "NO");

    }

    public static boolean areArraysEqual(int[][] a, int[][] b) {
        boolean isSame = true;
        for(int y = 0; y < H; y++) {
            for (int x = 0; x < W; x++) {
                if (map1[y][x] != map2[y][x]) {
                    return false;
                }
            }
        }

        return isSame;
    }
}