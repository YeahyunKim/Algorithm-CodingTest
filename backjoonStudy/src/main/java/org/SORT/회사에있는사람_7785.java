package org.SORT;

import java.util.*;

public class 회사에있는사람_7785 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();

        int N = input.nextInt();
        input.nextLine();

        for(int i = 0; i < N; i++) {
            String[] s = input.nextLine().split(" ");

            if(s[1].equals("enter")) {
                hashMap.put(s[0], hashMap.getOrDefault(s[0], 0) + 1);
            } else {
                hashMap.remove(s[0]);
            }
        }

        ArrayList<String> arrayList = new ArrayList<>(hashMap.keySet());

        Collections.sort(arrayList, Collections.reverseOrder());

        for(String s : arrayList) {
            System.out.println(s);
        }

    }
}