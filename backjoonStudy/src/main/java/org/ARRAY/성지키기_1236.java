package org.ARRAY;

import java.util.Scanner;

public class 성지키기_1236 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        input.nextLine();
        int answer = 0;

        for(int i = 0; i < N; i++) {
            String s = input.nextLine();
            if(!s.contains("X")) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
