package org.주사위3과4의배수구하기;

import java.util.ArrayList;
import java.util.Arrays;

public class HashSet {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //3의배수와 4의 배수의 총 개수 구하기
        int[] a2 = {1, 2, 3, 4, 5, 6};
        int[] b2 = {1, 2, 3, 4, 5, 6};
        java.util.HashSet<ArrayList> hashSet = new java.util.HashSet<>();

        for(int a : a2) {
            for(int b : b2){
                if((a + b) % 3 == 0 || (a + b) % 4 == 0) {
                    ArrayList<Integer> arrayList =  new ArrayList<>(Arrays.asList(a, b));
                    hashSet.add(arrayList);
                }
            }
        }
        System.out.println(hashSet.size());

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("총 걸린 시간 : " + duration + " nanoseconds");

    }
}