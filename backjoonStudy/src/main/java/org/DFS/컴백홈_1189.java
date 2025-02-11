package org.DFS;

import java.util.Arrays;
import java.util.Scanner;

public class 컴백홈_1189 {
    static int H, W, DISTANCE;
    static String[][] map;
    static int[] dirY = {1, -1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};
    static int count = 0;


    public static void dfs(int y, int x, int depth) {
        map[y][x] = "s";
        if(depth == DISTANCE && y == 0 && x == W-1) {
            count++;
            return;
        }

        if(depth > DISTANCE ) {
            return;
        }

        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if (newY < H && newX < W && newY >= 0 && newX >= 0 && map[newY][newX].equals(".")) {
                dfs(newY, newX, depth+1);
                map[newY][newX] = ".";
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        H = input.nextInt();
        W = input.nextInt();
        DISTANCE = input.nextInt();
        input.nextLine();

        map = new String[H][W];
        for(int i = 0; i < H; i++) {
            String[] s = input.nextLine().split("");
            for(int j = 0; j < W; j++) {
                map[i][j] = s[j];
            }
        }


        dfs(H-1, 0, 1);
        System.out.println(count);
    }
}