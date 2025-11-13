import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();

        for(int i = 0; i < N; i++) {
            int H = input.nextInt();
            int W = input.nextInt();
            int CUSTOMER = input.nextInt();

            String unit = "";
            String number = "";
            if(CUSTOMER % H == 0) {
                unit = String.valueOf(H);
                number = String.valueOf(CUSTOMER / H);
            } else {
                unit = String.valueOf(CUSTOMER % H);
                number = String.valueOf((CUSTOMER / H) + 1);
            }
            
            
            if(number.length() < 2) {
                number = "0" + number;
            }
            System.out.println(unit+number);
        }
    }   
}