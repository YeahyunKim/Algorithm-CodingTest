import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[] ground = new int[N+2];
        int[] groundPrefix = new int[N+2];

        for(int i = 1; i <= N; i++) {
            int a = input.nextInt();
            ground[i] = a;
        }

        for(int i = 0; i < M; i++) {
            int a = input.nextInt();
            int b = input.nextInt()+1;
            int c = input.nextInt();

            groundPrefix[a] += c;
            groundPrefix[b] -= c;
        }


        for(int i = 1; i <= N; i++) {
            groundPrefix[i] = groundPrefix[i-1] + groundPrefix[i];
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= N; i++) {
            ground[i] += groundPrefix[i];
            sb.append(ground[i] + " ");
        }

        System.out.println(sb);
    }
}
