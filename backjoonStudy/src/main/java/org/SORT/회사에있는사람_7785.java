package org.SORT;

import java.util.HashMap;
import java.util.Scanner;

public class 회사에있는사람_7785 {
    public static void main(String[] args) {

        String[] s = {"t", "s"};
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        HashMap<String, String> hashMap = new HashMap<>();

        for(int i = 0; i < N; i++) {
            hashMap.put("t", hashMap.getOrDefault("t", "s") +1);



        }
//        hashMap.put(input.next(), hashMap.getOrDefault())

    }
}
