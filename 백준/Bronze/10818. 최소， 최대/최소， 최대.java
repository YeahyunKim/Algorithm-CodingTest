import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        input.close();

        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[N-1]);
        
    }
}