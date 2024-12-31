import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isReverse = true;
        while(true) {
            int x = input.nextInt();
            isReverse = true;
            if(x == 0) {
                break;
            }
            String[] s = String.valueOf(x).split("");
            for(int i = 0; i < s.length; i++) {
                if(!s[i].equals(s[s.length-i-1])) {
                    isReverse = false;
                }
            }

            System.out.println(isReverse ? "yes" : "no");
        }
    }
}