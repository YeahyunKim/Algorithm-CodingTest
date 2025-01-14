package org.PARAMETRIC_SEARCH;

import java.util.Arrays;
import java.util.Scanner;

public class 랜선자르기_1654 {
    static int LAN_COUNT;
    static int NEED_LAN_COUNT;
    static int[] LAN_LIST;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LAN_COUNT = input.nextInt();
        NEED_LAN_COUNT = input.nextInt();
        LAN_LIST = new int[LAN_COUNT];


        for(int i = 0; i < LAN_COUNT; i++) {
            LAN_LIST[i] = input.nextInt();
        }

        Arrays.sort(LAN_LIST);

        System.out.println(getLanLength());
    }
    static long getLanLength() {
        long l = 1;
        long r = LAN_LIST[LAN_LIST.length-1];

        long answer = 0;

        while(l <= r) {
            long length = (l + r) / 2;

            if(isPossible(length)) {
                l = length + 1;
                answer = length;
            } else {
                r = length - 1;
            }
        }
        return answer;
    }

    static boolean isPossible(long length2) {
        long count = 0;

        for(int a : LAN_LIST) {
            if(a >= length2) count += a / length2;
        }

        return NEED_LAN_COUNT <= count;
    }
}
