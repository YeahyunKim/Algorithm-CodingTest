import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int[] array = new int[N + 1];

        for(int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }

        int start = 0;
        int end = 0;
        int answer = Integer.MAX_VALUE;
        int sum = 0;
        
        while(start <= N && end <= N) {
            if(sum >= M && answer > end - start) answer = end - start;

            if(sum < M) {
                sum += array[end++];
            } else {
                sum -= array[start++];

            }
        }
        if (answer == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }
}
