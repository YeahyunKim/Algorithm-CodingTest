package org.BINARY_SEARCH;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열집합_14425 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int answer = 0;
        int N = input.nextInt();
        int M = input.nextInt();

        String[] words = new String[N];
        String[] dictionary = new String[M];

        for(int i = 0; i < N; i++) {
            words[i] = input.next();
        }

        for(int i = 0; i < M; i++) {
            dictionary[i] = input.next();
        }

        Arrays.sort(words);

        for(int i = 0; i < M; i++) {
            if(binarySearch(dictionary[i], words)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
    
    public static boolean binarySearch(String word, String[] dictionaryList) {
        int start = 0;
        int end = dictionaryList.length -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(word.compareTo(dictionaryList[mid]) == 0) {
                return true;
            }
            else if(word.compareTo(dictionaryList[mid]) > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
