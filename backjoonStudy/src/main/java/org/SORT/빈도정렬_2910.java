package org.SORT;

import java.util.*;

public class 빈도정렬_2910 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();

        int N = input.nextInt();
        int M = input.nextInt();

        for(int i = 0; i < N; i ++) {
            int a = input.nextInt();
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }

        ArrayList<Integer> arrayList = new ArrayList<>(hashMap.keySet());

        Collections.sort(arrayList, (o1, o2) -> Integer.compare(hashMap.get(o2), hashMap.get(o1)));


        for (int a : arrayList) {
            for(int i = 0; i < hashMap.get(a); i++) {
                System.out.print(a + " ");
            }
        }
    }
}
