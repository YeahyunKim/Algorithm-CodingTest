import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int N = input.nextInt();
        
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }
        
        Arrays.sort(array);
        
        for(int i : array) {
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}