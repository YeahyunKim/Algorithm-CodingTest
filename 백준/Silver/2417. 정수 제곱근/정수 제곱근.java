import java.util.*;

public class Main{
   static long N;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextLong();

        System.out.println(calcSqrt());
    }
    public static boolean isPow(long q) {
        if(q * q >= N) {
            return true;
        }
        return false;
    }
    public static long calcSqrt() {
        if(N == 0)
            return 0;

        long low = 1;
        long hi = (long) Math.pow(2, 32);
        long sqrt = -1;

        while (low <= hi) {
            long mid = (low + hi) / 2;

            if(mid >= (N - 1) / mid + 1) {
                hi = mid - 1;
                sqrt = mid;
            } else {
                low = mid + 1;
            }

        }

        return sqrt;
    }
}