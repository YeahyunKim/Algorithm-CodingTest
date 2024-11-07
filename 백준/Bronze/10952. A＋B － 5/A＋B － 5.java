import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        while(input.hasNextInt()) {
            int x = input.nextInt();
            int y = input.nextInt();
            
            if (x + y != 0)
                System.out.println(x+y);
        }
        
        
    }
}