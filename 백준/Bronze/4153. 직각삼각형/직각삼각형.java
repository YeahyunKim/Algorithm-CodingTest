
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while(true) {
            int A = input.nextInt();
            int B = input.nextInt();
            int C = input.nextInt();

            if(A == 0 && B == 0 && C == 0) break;

            if (C * C == (A * A) + (B * B)) {
                System.out.println("right");

            } else if(A * A == (C * C) + (B * B)) {
                System.out.println("right");
            } else if(B * B == (C * C) + (A * A)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }


    }
}