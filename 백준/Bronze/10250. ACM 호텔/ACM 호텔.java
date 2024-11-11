import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        
        for(int i = 0 ; i < N; i++) {
            int count = 0;
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            
            for(int k = 1; k <= b; k++) {
                for(int j = 1; j <= a; j++) {
                    count++;
                    if(count == c) {
                        if(k <= 9  && k >= 1) {
                            System.out.println(j + "0" + k);   
                        } else {
                            System.out.println(j + "" + k);   
                        }
                    }
                }
            }
        }
    }
}