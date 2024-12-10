import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long answer = 0;
        int N = input.nextInt();
        input.nextLine();
        String[] s = input.nextLine().split("");
        for(int i = 0; i < N; i++) {
            int a = s[i].charAt(0) - 96;
            answer += (long) (a * Math.pow(31, i));
        }

        System.out.println(answer);
    }
}

