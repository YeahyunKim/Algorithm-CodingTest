import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        for(int i = 0; i < N; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            
            System.out.println(x+y);
        }
    }
}