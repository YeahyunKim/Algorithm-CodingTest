import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        System.out.println((a + b) - c);
        
        System.out.println(Integer.parseInt(a+"" + b+"") - c);
    }
}