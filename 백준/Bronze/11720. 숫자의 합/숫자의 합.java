import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        String b = input.next();
        int sum = 0;
        
        for(char c : b.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));    
        }
        System.out.println(sum);
    }
}