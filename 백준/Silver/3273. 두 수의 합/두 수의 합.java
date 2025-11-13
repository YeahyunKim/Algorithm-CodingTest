import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();

        int[] array = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }
        
        Arrays.sort(array);
        
        int X = input.nextInt();
        
        int left = 0;
        int right = N - 1;
        int answer = 0;

        while(left < right) {
            int sum = array[left] + array[right];
            if(sum == X) {
                left++;
                right--;
                answer++;
            } else if(sum < X) {
                left++;
            } else if(sum > X) {
                right--;
            }
        }
        
        System.out.println(answer);
        
    }
}