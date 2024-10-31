import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        
        for(int i = 0; i < T; i++) {
            int R = input.nextInt();
            String S = input.next();
            for(char c : S.toCharArray()) {
                for(int j = 0; j < R; j++) {
                    System.out.print(c);
                }
            }
            System.out.println();            
        }

    }
}