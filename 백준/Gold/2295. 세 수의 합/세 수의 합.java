import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        int[] array = new int[N];
        
        for(int i = 0; i < N; i++) {
            int num = input.nextInt();
            array[i] = num;
        }
        
        Arrays.sort(array);
        
        HashSet<Integer> hashSet = new HashSet<>();
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                hashSet.add(array[i] + array[j]);
            }
        }
        
        
        int answer = 0;
        for(int i = N-1; i > 0 ; i--) {
            for(int j = i-1; j >= 0; j--) {
                if(hashSet.contains(array[i]-array[j])) {
                    answer = Math.max(answer, array[i]);
                }
            }
        }
        
        System.out.println(answer);
    }   
}