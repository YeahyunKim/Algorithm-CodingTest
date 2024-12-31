
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        int start = 0;
        int max = 0;
        int[] cards = new int[N];
        for(int i = 0; i < N; i++) {
            cards[i] = input.nextInt();
        }

        for(int i = 0; i < cards.length; i++) {
            for(int j = i + 1; j < cards.length-1; j++) {
                start = j;
                while(start != cards.length - 1) {
                    start++;
                    int number = cards[i] + cards[j] + cards[start];
                    if(number <= M) {
                        max = Math.max(max, number);
                    }

                }
//

            }
        }

        System.out.println(max);
    }
}