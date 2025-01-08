import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        int[] quries = new int[N+1];

        for(int i = 0; i < N; i++) {
            int n = input.nextInt();
            quries[i+1] = quries[i] ^ n;
        }

        int result = 0;
        for(int i = 0; i < M; i++) {
            int s = input.nextInt();
            int e = input.nextInt();

            result = result ^ (quries[e] ^ quries[s-1]);
        }
        System.out.println(result);
    }
}
