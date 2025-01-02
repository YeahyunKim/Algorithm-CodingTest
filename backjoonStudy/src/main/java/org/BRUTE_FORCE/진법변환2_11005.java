package org.BRUTE_FORCE;

import java.util.Scanner;

public class 진법변환2_11005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        String ans = "";

        while(N > 0) {
            int D = N % M;
            N = N / M;

            if(D < 10) ans += D;
            else ans += (char) (D - 10 + 'A');
        }

        for(int i = ans.length() -1; i >= 0; i--) {
            System.out.print(ans.charAt(i));
        }
    }
}
