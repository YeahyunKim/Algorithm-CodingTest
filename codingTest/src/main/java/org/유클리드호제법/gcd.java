package org.유클리드호제법;

public class gcd {
    public static void main(String[] args) {
        int a = 888;
        int b = 1029;

        System.out.println(a > b ? gcd(a, b) : gcd(b, a));

        if(a > b) {
            System.out.println(gcd(a,b));
        } else {
            System.out.println(gcd(b, a));
        }

    }

    public static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }

        return gcd(b, a%b);
    }
}
