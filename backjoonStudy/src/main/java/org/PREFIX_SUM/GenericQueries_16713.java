package org.PREFIX_SUM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GenericQueries_16713 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        int[] quries = new int[N+1];

        for(int i = 0; i < N; i++) {
            int n = input.nextInt();
            quries[i+1] = quries[i] ^ n;
        }

        int result = 0;
        for(int i = 0; i < M; i++) {
            int s = input.nextInt();
            int e = input.nextInt();

            result = result ^ (quries[e] ^ quries[s-1]);
        }
        System.out.println(result);
    }
}
