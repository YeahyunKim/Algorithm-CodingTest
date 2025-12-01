import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();


        for(int i = 0; i < N; i++) {
            String word = input.nextLine();

            int L = 0;
            int R = word.length()-1;
            int answer = 0;

            while(L <= R) {
                if(word.charAt(L) != word.charAt(R)) {
                    if(palindrome(word, L+1, R) == 1 || palindrome(word, L, R-1) == 1) {
                        answer = 1;
                        break;
                    } else {
                        answer = 2;
                        break;
                    }
                }
                L++;
                R--;

            }

            System.out.println(answer);

        }
    }
    //omwwtmo
    public static int palindrome(String word, int L, int R) {
        while(L <= R) {
            if(word.charAt(L) != word.charAt(R)) {
                return 2;
            }
            L++;
            R--;
        }
        return 1;
    }

}