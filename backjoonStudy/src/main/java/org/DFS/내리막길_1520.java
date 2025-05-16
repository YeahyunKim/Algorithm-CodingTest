package org.DFS;

import java.util.Scanner;

public class 내리막길_1520 {
    static int[][] map;
    static int H, W;
    static int[] dirY = {1, -1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};
    static int count = 0;

    public static void dfs(int y, int x, int parent) {
        if(y == H-1 && x == W-1) {
            count++;
            return;
        }

        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if(newY < H && newX < W && newY >= 0 && newX >= 0 && parent > map[newY][newX]) {
                dfs(newY, newX, map[newY][newX]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        H = input.nextInt();
        W = input.nextInt();

        map = new int[H][W];

        for(int i = 0; i< H; i++) {
            for(int j = 0; j < W; j++) {
                int a = input.nextInt();
                map[i][j] = a;
            }
        }

        dfs(0, 0, map[0][0]);

        System.out.println(count);
    }
}
