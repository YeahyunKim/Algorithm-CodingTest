package org.BINARY_SEARCH;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자카드2_10816 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] cards = new int[N];

        for(int i = 0; i < N; i++) {
            cards[i] = input.nextInt();
        }

        Arrays.sort(cards);

        int M = input.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++) {
            int select = input.nextInt();
            sb.append((findUpperIndex(cards, select) - findLowerIndex(cards, select)) + " ");

        }
        System.out.println(sb);

    }
    public static int findLowerIndex(int[] array, int a) {
        int l = 0;
        int r = array.length;

        while(l < r) {
            int mid = (l + r) / 2;

            if(a <= array[mid]) {
                r = mid;
            } else {
                l = mid + 1;
            }

        }
        return l;
    }

    public static int findUpperIndex(int[] array, int a) {
        int l = 0;
        int r = array.length;

        while(l < r) {
            int mid = (l + r) / 2;

            if(a < array[mid]) {
                r = mid;
            } else {
                l = mid + 1;
            }

        }
        return l;
    }
}
