import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        
        int day = (C - B) / (A - B);
        
        if((C - B) % (A - B) != 0)
            day++;
        
        System.out.println(day);
    }
}