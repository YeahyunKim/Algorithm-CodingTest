package org.STRING;

import java.util.Scanner;

public class 문서검색_1543 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        String searchWord = input.nextLine();

        int startIndex = 0;
        int endIndex = 1;              

        int answer = 0;
        while(startIndex < str.length()-2) {

            if (str.substring(startIndex, endIndex).equals(searchWord)) {
                str = str.substring(endIndex, str.length()).trim();
                ;
                startIndex = 0;
                endIndex = 1;
                answer++;
            }
            if (endIndex == str.length() - 1) {
                startIndex++;
                endIndex = startIndex + 1;
            } else {
                endIndex++;
            }
        }
        System.out.println(answer);
    }
}
