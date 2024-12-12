import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int count = 0;
        int num = 0;
        while(count != N) {
            num++;
            
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        
        System.out.println(num);
    }
}