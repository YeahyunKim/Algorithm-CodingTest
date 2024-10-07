package org.주사위가각각3의배수4의배수인경우의수;

import java.util.HashSet;

public class HashSetSolution {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        //주사위가 a와 b가 각각 3의 배수 4의 배수로 나온 경우,
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 3, 4, 5, 6};

        HashSet<Integer> aHashSet = new HashSet<>();
        HashSet<Integer> bHashSet = new HashSet<>();

        for(int aa : a) {
            if(aa % 3 == 0) aHashSet.add(aa);
            if(aa % 4 == 0) bHashSet.add(aa);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("총 걸린 시간 : " + duration + " nanoseconds");

        System.out.println(aHashSet.size() * bHashSet.size());
    }
}
