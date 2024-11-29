import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();

        int count = 0;
        int answer = 0;

        for(int i = 0; i < N; i++) {
            String[] strList = input.nextLine().split("");

            for(int j = 0; j < strList.length; j++) {
                if(strList[j].equals("O")) {
                    count++;
                } else {
                    count = 0;
                }
                answer += count;
            }
            System.out.println(answer);
            count = 0;
            answer = 0;
        }


    }

}