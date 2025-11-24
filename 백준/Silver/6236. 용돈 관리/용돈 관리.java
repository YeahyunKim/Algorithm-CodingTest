import java.util.*;

public class Main {
 static int N, WITHDRAW_COUNTS;
    static int[] array;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        WITHDRAW_COUNTS = input.nextInt();

        array = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }


        int l = 1;
        int r = 1000000000;
        int answer = 0;
        while(l <= r) {
            int amount = (l + r) / 2;

            if(isCorrectCount(amount)) {
                r = amount -1;
                answer = amount;
            } else {
                l = amount + 1;
            }
        }

        System.out.println(answer);
    }

    public static boolean isCorrectCount(int amount) {
        int count = 1;
        int total = 0;

        for(int i = 0; i < N; i++) {
            if(array[i] > amount) return false;
            if(total + array[i] <= amount) {
                total += array[i];
            } else {
                total = 0;
                total += array[i];
                if(count == WITHDRAW_COUNTS) return false;
                count++;
            }
        }

        return true;

    }
}