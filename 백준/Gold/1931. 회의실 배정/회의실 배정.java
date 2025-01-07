import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[][] time = new int[N][2];

        for(int i = 0; i < N; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            time[i][0] = a;
            time[i][1] = b;
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int endTime = 0;
        int count = 0;
        for(int i = 0; i < time.length; i++) {
            if(endTime <= time[i][0]) {
                endTime = time[i][1];
                count++;
            }
        }

        System.out.println(count);

    }
}
