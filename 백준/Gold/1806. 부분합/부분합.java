import java.util.*;

public class Main {
    static int N, S;
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     
        
        N = input.nextInt();
        S = input.nextInt();
        
        int[] array = new int[N+1];
        
        for(int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }
        
        int i = 0;
        int j = 0;
        
        int sum = 0;

        int answer = Integer.MAX_VALUE;
        
        while(i <= N && j <= N) {
            if(sum >= S && answer > j - i) answer = j - i;
            
            if(sum < S) {
                sum += array[j++];
            } else {
                sum -= array[i++];
            }
            
        }
        
        if(answer == Integer.MAX_VALUE) {
            answer = 0;
        }
        System.out.print(answer);
    }
}