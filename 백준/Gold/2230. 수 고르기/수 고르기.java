import java.util.*;

public class Main {
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
        
        // 1 2 3 4 5
        // 차이가 3 이상일 때,
        // (1, 4) , (1, 5) 정답은 3;
        
        // i = 0   [1] 2 3 4 5
        // j = 1    1 [2] 3 4 5
        // 차이가 < 3 ==> j++
        
        // i = 0   [1] 2 3 4 5
        // j = 2    1 2 [3] 4 5
        // 차이가 < 3 ==> j++
        
        // i = 0   [1] 2 3 4 5
        // j = 3    1 2 3 [4] 5
        // 차이가 <= 3 ==> 정답
        
        
        // 1 5 10 11 12
        
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
