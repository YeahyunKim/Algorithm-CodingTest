import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] HOUSE_LOCATION;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        M = input.nextInt();

        HOUSE_LOCATION = new int[N];

        for(int i = 0; i < N; i++) {
            HOUSE_LOCATION[i] = input.nextInt();
        }

        Arrays.sort(HOUSE_LOCATION);
        System.out.println(getDistance());

    }
    static int getDistance() {
        int l = 1;
        int r = HOUSE_LOCATION[HOUSE_LOCATION.length-1] - HOUSE_LOCATION[0];
        int answer = 0;

        while(l <= r) {
            int distance = (l + r) / 2;

            if(getCount(distance) >= M) {
                l = distance + 1;
                answer = distance;
            } else {
                r = distance - 1;
            }

        }

        return answer;
    }
    static int getCount(int distance2) {
        int temp = HOUSE_LOCATION[0];
        int count = 1;

        for(int i = 1; i < HOUSE_LOCATION.length; i++) {
            if(HOUSE_LOCATION[i] - temp >= distance2) {
                temp = HOUSE_LOCATION[i];
                count++;
            }
        }
        return count;
    }
}
