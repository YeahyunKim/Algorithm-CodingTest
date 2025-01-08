package org.PREFIX_SUM;

import java.util.Arrays;
import java.util.Scanner;

public class 구간합구하기5_11660 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        input.nextLine();

        int[][] map = new int[N+1][N+1];
        int[][] coordinate = new int[M][4];

        for(int y = 1; y <= N; y++) {
            for(int x = 1; x <= N; x++) {
                int s = input.nextInt();

                map[y][x] = s + map[y-1][x] + map[y][x-1] - map[y-1][x-1];
            }
        }

        for(int j = 0; j < M; j++) {
            int answer = 0;
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();

            answer = map[x2][y2] - map[x1-1][y2] - map[x2][y1-1] + map[x1-1][y1-1];
            System.out.println(answer);
        }

    }
}
