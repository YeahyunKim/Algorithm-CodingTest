import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(input.hasNextInt()) {
            int x = input.nextInt();
            int y = input.nextInt();
            
            System.out.println(x+y);
        }
    }
}