import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger answer = BigInteger.valueOf(0);
        int N = input.nextInt();
        input.nextLine();
        String[] s = input.nextLine().split("");
        for(int i = 0; i < N; i++) {
            int a = s[i].charAt(0) - 96;
            BigInteger term = BigInteger.valueOf(a).multiply(BigInteger.valueOf(31).pow(i));
            answer = answer.add(term); // BigInteger의 add 메서드 사용
        }

        System.out.println(answer.remainder(BigInteger.valueOf(1234567891)));
    }
}


