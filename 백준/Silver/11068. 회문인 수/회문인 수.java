import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();


        for(int i = 0; i < N; i++) {
            int A = input.nextInt();

            boolean flag = false;


            for(int j = 2; j <= 64; j++) {
                int copyA = A;
                StringBuilder sb = new StringBuilder();
                
                while(copyA > 0) {
                    int left = copyA % j;
                    copyA = copyA / j;

                    if(left < 10) sb.insert(0, left);
                    else sb.insert(0, (char) ((left - 10) + 'A'));


                }
                
                if(isPalindrome(sb.toString())) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start++;
                end--;   
            }
        }

        return true;
    }
}