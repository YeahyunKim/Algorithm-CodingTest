import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int M = input.nextInt();
        
        int[] array = new int[N];
        
        for(int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }
        
        Arrays.sort(array);
        
        
        int i = 0;
        int j = 0;

        int answer = Integer.MAX_VALUE;

        while(i < N && j < N) {
            if(array[j] - array[i] >= M && answer > array[j] - array[i]) answer = array[j] - array[i];
            
            if(array[j] - array[i] > M) {
                i++;
            } else {
                j++;
            }
        }
        
        System.out.print(answer);
    }
}