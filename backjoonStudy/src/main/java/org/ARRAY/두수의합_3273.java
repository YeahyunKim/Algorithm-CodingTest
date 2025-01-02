package org.ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class 두수의합_3273 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[] array = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }

        int X = input.nextInt();

        Arrays.sort(array);

        int leftPoint = 0;
        int rightPoint = N-1;
        int answer = 0;

        while(leftPoint < rightPoint) {
            if(array[leftPoint] + array[rightPoint] == X) {
                answer++;
                leftPoint++;
                rightPoint--;
            } else if(array[leftPoint] + array[rightPoint] < X) {
                leftPoint++;
            } else if(array[leftPoint] + array[rightPoint] > X) {
                rightPoint--;
            }
        }

        System.out.println(answer);
    }
}
