import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int M = input.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        while(N > 0) {
            int left = N % M;
            N = N / M;
            if(left >= 10) sb.insert(0, (char) ('A' + (left - 10)));
            else sb.insert(0, String.valueOf(left));
        }
        
        System.out.print(sb);
    }
}