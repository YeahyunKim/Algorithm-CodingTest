import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] DAILY_MONEY;
    static int max = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();

        DAILY_MONEY = new int[N];

        for(int i = 0; i < N; i++) {
            int a = input.nextInt();
            max = Math.max(max, a);
            DAILY_MONEY[i] = a;
        }
        System.out.println(getLeastMoney());


    }
    static int getLeastMoney() {
        int l = max;
        int r = 1000000000;

        int answer = -1;

        while(l <= r) {
            int money = (l + r) / 2;
            if(isPossible(money)) {
                r = money -1;
                answer = money;
            } else {
                l = money + 1;
            }
        }

        return answer;
    }

    static boolean isPossible(int drawAmount) {
        int count = 1;
        int leftMoney = drawAmount;
        for(int dailyMoney : DAILY_MONEY) {
            if(dailyMoney > drawAmount) return false;
            if(leftMoney < dailyMoney) {
                if(count == M) return false;
                count++;
                leftMoney = drawAmount;
            }
            leftMoney -= dailyMoney;
        }
        return true;
    }
}
