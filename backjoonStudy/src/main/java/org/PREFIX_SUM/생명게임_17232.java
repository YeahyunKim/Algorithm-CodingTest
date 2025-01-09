package org.PREFIX_SUM;

import java.util.Arrays;
import java.util.Scanner;

public class 생명게임_17232 {
    static int H, W;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        H = input.nextInt();
        W = input.nextInt();

        int TIME = input.nextInt();

        int k = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        input.nextLine();


        String[][] map = new String[H+1][W+1];

        for(int h = 1; h <= H; h++) {
            String[] s = input.nextLine().split("");

            for(int w = 1; w <= W; w++) {
                map[h][w] = s[w-1];
            }
        }


        for(int t = 0; t < TIME; t++) {
            int[][] mapPrefixSum = prefixSum(map);
            for(int h = 1; h <= H; h++) {
                for(int w = 1; w <= W; w++) {
                    int lifeCount = countLife(mapPrefixSum, h, w, k);
                    System.out.println(lifeCount);
                    if(map[h][w].equals("*")) {
                        lifeCount--;
                        if(lifeCount < a || b < lifeCount) {
                            map[h][w] = ".";
                        }
                    } else if(a < lifeCount && lifeCount <= b) {
                        map[h][w] = "*";
                    }
                }
            }
        }

        for(int i = 1; i <= H; i++) {
            for(int j = 1; j <= W; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] prefixSum(String[][] map2) {
        int[][] mapInt = new int[H+1][W+1];

        for(int h = 1; h <= H; h++) {

            for(int w = 1; w <= W; w++) {
                mapInt[h][w] = map2[h][w].equals("*") ? 1 : 0;
                mapInt[h][w] = mapInt[h-1][w] + mapInt[h][w-1] - mapInt[h-1][w-1] + mapInt[h][w];
            }
        }
        return mapInt;
    }

    public static int countLife(int[][] map2, int x, int y, int k) {
        int x1 = Math.max(x - k, 1);
        int y1 = Math.max(y - k, 1);
        int x2 = Math.min(x + k, map2.length-1);
        int y2 = Math.min(y + k, map2[0].length-1);

        return map2[x2][y2] - map2[x1-1][y2] - map2[x2][y1-1] + map2[x1-1][y1-1];
    }
}
