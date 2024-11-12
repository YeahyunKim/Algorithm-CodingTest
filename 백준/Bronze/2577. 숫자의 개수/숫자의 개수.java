import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] list = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        
        String sumStr = String.valueOf(A * B * C);
        for(char c : list) {
            int count = 0;
            for(int i = 0; i < sumStr.length(); i++) {
                if(sumStr.charAt(i) == c) count++;
            }
            System.out.println(count);
        }
        
    }
}