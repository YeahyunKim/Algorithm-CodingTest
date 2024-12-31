import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String s = input.next();
        int n = input.nextInt();
        
        System.out.println(s.charAt(n-1));
    }
}