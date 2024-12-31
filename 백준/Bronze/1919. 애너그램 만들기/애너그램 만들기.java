import java.util.Scanner;

public class Main {

    public static int[] addAlphabetCount(String s) {
        int[] countStr = new int[26];
        for(int i = 0; i < s.length(); i++) {
            countStr[s.charAt(i) - 'a']++;
        }
        return countStr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.next();
        String str2 = input.next();

        int[] countStr1 = addAlphabetCount(str1);
        int[] countStr2 = addAlphabetCount(str2);

        int answer = 0;

        for(int i = 0; i < 26; i++) {
            if(countStr1[i] != countStr2[i]) answer += Math.abs(countStr1[i] - countStr2[i]);
        }

        System.out.println(answer);

    }
}
