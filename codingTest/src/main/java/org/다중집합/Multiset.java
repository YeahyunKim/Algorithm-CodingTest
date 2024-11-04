package org.다중집합;

public class Normal2 {
    public static void main(String[] args) {
        String str1 = "handshake";
        String str2 = "shake hands";

        for(int i = 0; i < str1.length() - 1; i++) {
            String str = Character.toUpperCase(str1.charAt(i-1)) + "" + Character.toUpperCase(str1.charAt(i));
            System.out.println(str);
        }


    }
}
