package org.DFS;

import java.util.*;

public class 영역구하기_2583 {
    static int Y, X, C;
    static boolean[][] map;
    static int count = 0;
    static int width = 0;
    static int[] dirY = {1, -1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};


    public static void dfs(int y, int x) {
        width++;
        map[y][x] = true;

        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if(newY < Y && newX < X && newY >= 0 && newX >= 0 && !map[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        Y = input.nextInt();
        X = input.nextInt();
        C = input.nextInt();

        map = new boolean[Y][X];

        for(int i = 0; i < C; i++) {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();

            for(int y = y1; y < y2; y++) {
                for(int x = x1; x < x2; x++) {
                    map[y][x] = true;
                }
            }
        }

        for(int i = 0; i < Y; i++) {
            for(int j = 0; j < X; j++) {
                if(!map[i][j]) {
                    dfs(i, j);
                    count++;
                    arrayList.add(width);
                    width = 0;
                }
            }
        }
        Collections.sort(arrayList);

        System.out.println(count);

        for(int i : arrayList) {
            System.out.print(i + " ");
        }

    }
}