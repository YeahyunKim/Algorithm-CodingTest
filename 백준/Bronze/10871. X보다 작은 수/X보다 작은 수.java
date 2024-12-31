import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        for(int i = 0; i < a; i++) {
            int c = input.nextInt();
            if(c < b)
                System.out.print(c + " ");
        }
        
    }
}