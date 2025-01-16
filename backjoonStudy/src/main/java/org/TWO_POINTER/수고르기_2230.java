package org.TWO_POINTER;

import java.util.Arrays;
import java.util.Scanner;

public class 수고르기_2230 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[] array = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }

        Arrays.sort(array);

        int start = 0;
        int end = 0;
        int answer = Integer.MAX_VALUE;

        while(start < N && end < N) {
            if(array[end] - array[start] == M) {
                answer = M;
                break;
            }
            if(array[end] - array[start] > M) {
                answer = Math.min(answer, array[end] - array[start]);
                start++;
            } else {
                end++;
            }
        }

        System.out.println(answer);
    }
}
