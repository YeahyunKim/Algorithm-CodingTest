package org.BRUTE_FORCE;

import java.util.Arrays;
import java.util.Scanner;

public class 사탕게임_3085 {
    static int N;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        input.nextLine();

        String[][] map = new String[N][N];

        for(int i = 0; i < N; i++) {
            String[] s = input.nextLine().split("");
            for(int j = 0; j < N; j++) {
                map[i][j] = s[j];
            }
        }

        for(int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(map[i]));
        }

        int answer = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int newX = j + 1;
                int newY = i + 1;
                if(newX < N && !map[i][j].equals(map[i][newX])) {
                    swapCandy(map, i, j, i, newX);
                    answer = Math.max(answer, Math.max(findColCount(map), findRowCount(map)));
                    swapCandy(map, i, j, i, newX);
                }

                if(newY < N && !map[i][j].equals(map[newY][j])) {
                    swapCandy(map, i, j, newY, j);
                    answer = Math.max(answer, Math.max(findColCount(map), findRowCount(map)));
                    swapCandy(map, i, j, newY, j);
                }
            }
        }

        System.out.println(answer);


    }

    public static String[][] swapCandy(String[][] swapArray, int y, int x, int y2, int x2) {
        String temp = swapArray[y][x];
        swapArray[y][x] = swapArray[y2][x2];
        swapArray[y2][x2] = temp;
        return swapArray;
    }

    public static int findColCount(String[][] swapArray) {
        int max = 0;
        for(int y = 0; y < N; y++) {
            int colCount = 1;
            for(int x = 1; x < N; x++) {
                if(swapArray[y][x-1].equals(swapArray[y][x])) {
                    colCount++;
                } else {
                    max = Math.max(colCount, max);
                    colCount = 1;
                }
            }
            max = Math.max(colCount, max);
        }
        return max;
    }

    public static int findRowCount(String[][] swapArray) {
        int max = 0;
        for(int x = 0; x < N; x++) {
            int rowCount = 1;
            for(int y = 1; y < N; y++) {
                if(swapArray[y-1][x].equals(swapArray[y][x])){
                    rowCount++;
                } else {
                    max = Math.max(max, rowCount);
                    rowCount = 1;
                }
            }
            max = Math.max(max, rowCount);
        }
        return max;
    }

}
