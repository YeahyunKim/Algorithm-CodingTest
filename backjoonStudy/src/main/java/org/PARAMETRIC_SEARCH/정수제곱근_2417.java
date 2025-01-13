package org.PARAMETRIC_SEARCH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 정수제곱근_2417 {
    static long N;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextLong();

        if(N == 0) {
            System.out.println(0);
        } else {

            long low = 0;
            long hi = (long) Math.pow(2, 32);
            long sqrt = -1;

            while (low <= hi) {
                long mid = (low + hi) / 2;

                if(isPow(mid)) {
                    hi = mid - 1;
                    sqrt = mid;
                } else {
                    low = mid + 1;
                }

            }
            System.out.println(sqrt);
        }

    }
    public static boolean isPow(long q) {
        if(q * q >= N) {
            return true;
        }
        return false;
    }
}


//9,223,372,036,854,775,808
//4,611,686,018,427,387,904