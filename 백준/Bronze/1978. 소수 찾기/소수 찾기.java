import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        int N = input.nextInt();

        for(int i = 0; i < N; i++) {
            int x = input.nextInt();
            if(isPrime(x)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int a) {
        if (a == 2 || a == 0) {
            return true;
        }
        if (a < 2) {
            return false;
        }
        for(int i = 2; i < a; i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }
}