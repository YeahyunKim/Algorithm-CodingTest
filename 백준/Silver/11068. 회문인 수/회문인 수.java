import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for(int i = 0; i < N; i++) {

            int M = input.nextInt();
            int answer = 0;

            for(int B = 2; B <= 64; B++) {
                StringBuilder sb = new StringBuilder();
                int X = M;

                while(X > 0) {
                    int left = X % B;
                    X = X / B;

                    if(left < 10) sb.insert(0, left);
                    else sb.insert(0, (char) ((left - 10) + 'A'));
                }

                if(palindrome(sb.toString()) == 1) {
                    answer = 1;
                    break;
                }
            }
            System.out.println(answer);
        }
    }

    public static int palindrome(String sb) {
        int left = 0;
        int right = sb.length() - 1;

        while(left < right) {
            if(sb.charAt(left) == sb.charAt(right)) {
                left++;
                right--;
                continue;
            } else {
                return 0;
            }
        }
        return 1;
    }
}