import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int B = input.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        while(num > 0) {
            int left = num % B;
            num = num / B;
            
            if(left < 10) sb.insert(0, left);
            else sb.insert(0, (char) ((left - 10) + 'A'));
        }
        
        System.out.println(sb.toString());
        
    }
}