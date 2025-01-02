import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int N = input.nextInt();

        for(int i = 0; i < N; i++) {
            boolean flag = false;

            int M = input.nextInt();

                for(int B = 2; B <= 64; B++) {
                    String convertStr = "";
                    int saveM = M;

                    while(saveM > 0) {
                        int d = saveM % B;
                        saveM = saveM / B;

                        if(d < 10) convertStr += d;
                        else convertStr += (char) (d - 10 + 'A');

                    }

                    if(isPalindrome(convertStr)) {
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
        int leftPoint = 0;
        int rightPoint = s.length() -1;

        while(leftPoint < rightPoint) {
            if(s.charAt(leftPoint) != s.charAt(rightPoint)) {
                return false;
            } else {
                leftPoint++;
                rightPoint--;
            }
        }
        return true;
    }
}
