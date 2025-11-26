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
        
        int M = input.nextInt();
        
        
        int i = 0;
        int j = array.length-1;
        int count = 0;
        while(i < j) {
            int sum = array[i] + array[j];
            if(sum == M) {
                count++;
                i++;
                j--;
                continue;
            }
            
            if(sum > M) {
                j--;
            } else {
                i++;
            }
        }
        
        System.out.print(count);
        
    }
}