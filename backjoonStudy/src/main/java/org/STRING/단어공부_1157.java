package org.STRING;

import java.util.Scanner;

public class 단어공부_1157  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String strList = input.next();
        int[] strCount = new int[26];

        for(char c : strList.toCharArray()) {
            strCount[Character.toLowerCase(c) - 'a']++;
        }

        int maxCount = -1;
        char maxAlphabet = '?';
        for(int i = 0; i < strCount.length; i++) {
            if(maxCount < strCount[i]) {
                maxCount = strCount[i];
                maxAlphabet = (char) ('A' + i);
            } else if(maxCount == strCount[i]) {
                maxAlphabet = '?';
            }
        }

        System.out.println((maxAlphabet));


    }
}
