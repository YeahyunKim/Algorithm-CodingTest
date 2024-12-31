import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int K = input.nextInt();
        
        int nP = 1;
        int kP = 1;
        int rP = 1;
        
        for(int i = 1; i <= N; i++) {
            nP *= i;
        }
        for(int i = 1; i <= K; i++) {
            kP *= i;
        }
        for(int i = 1; i <= N - K; i++) {
            rP *= i;
        }
        
        System.out.println(nP / (rP * kP));
        
        
    }
}