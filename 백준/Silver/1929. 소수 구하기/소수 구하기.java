import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = input.nextInt();
        int M = input.nextInt();

        for(int i = N; i <= M; i++) {
            if(isDecimal(i)) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean isDecimal(int a) {
        if(a <= 1) return false;
        if(a == 2) return true;
        if(a % 2 == 0) return false;

        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) {
                return false;
            }
        }

        return true;
    }
}