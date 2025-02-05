package org.CODING_TEST;

import java.util.Arrays;
import java.util.HashSet;

public class 무한한크기의그림판 {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {0, 1, 2, 0, 1};
        int[] b = {0, 1, 0, 0, 1};
        int[] c = {1, 2, 4, 4, 3};
        int[] d = {1, 2, 2, 1, 2};
        int[] copyA = {0, 1, 2, 0, 1};
        int[] copyB = {0, 1, 0, 0, 1};
        int[] copyC = {1, 2, 4, 4, 3};
        int[] copyD = {1, 2, 2, 1, 2};


        int[] answer = new int[n];



        Arrays.sort(copyA);
        Arrays.sort(copyB);
        Arrays.sort(copyC);
        Arrays.sort(copyD);


        int minA = copyA[0];
        int minB = copyB[0];
        int maxC = copyC[copyC.length - 1];
        int maxD = copyD[copyD.length - 1];

        int shiftNum = 0;

        if(minA < 0) {
            shiftNum = Math.abs(minA);
        } else {
            shiftNum = minA * -1;
        }


        int ySize = Math.abs(maxD - minB);
        int xSize = Math.abs(maxC - minA);

        int[][] map = new int[ySize][xSize];

        for(int i = 0; i < n; i++) {
            int ai = a[i];
            int bi = b[i];
            int ci = c[i];
            int di = d[i];

            HashSet<Integer> set = new HashSet<>();

            for(int j = ai; j < ci; j++){
                for(int k = bi; k < di; k++){
                    if(map[k][j] != 0){
                        set.add(map[k][j]);
                    }
                    map[k][j] = i+1;
                }
            }

            for(int j = 0; j < map.length; j++){
                for(int k = 0; k < map[0].length; k++){
                    if(set.contains(map[j][k])){
                        map[j][k] = i+1;
                    }
                }
            }
            System.out.println();
        }

        for(int i = 0; i < 2; i++) {
            System.out.println(Arrays.toString(map[i]));
        }

    }
}
