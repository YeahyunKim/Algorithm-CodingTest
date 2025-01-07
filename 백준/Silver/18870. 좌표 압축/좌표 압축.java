import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[] array = new int[N];
        int[] sortArray = new int[N];

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < N; i++) {
            int a = input.nextInt();
            array[i] = a;
            sortArray[i] = a;
        }

        Arrays.sort(sortArray);

        int rank = 0;
        for(int i = 0; i < sortArray.length; i++) {
            if(!hashMap.containsKey(sortArray[i])) {
                hashMap.put(sortArray[i], rank);
                rank++;
            }

        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            if(i != N-1) {
                sb.append(hashMap.get(array[i]) + " ");
            } else {
                sb.append(hashMap.get(array[i]));
            }
        }
        
        System.out.println(sb);
    }
}
