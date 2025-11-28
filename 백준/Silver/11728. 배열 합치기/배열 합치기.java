import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        int B = input.nextInt();
        
        int[] array = new int[A+B];
        
        for(int i = 0; i < A + B; i++) {
            array[i] = input.nextInt();
        }
        
        Arrays.sort(array);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < A + B; i++) {
            sb.append(array[i]).append(" ");
        }
        
        System.out.print(sb);
    }
}