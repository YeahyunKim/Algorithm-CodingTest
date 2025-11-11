import java.util.*;

public class Main{

    public static int[] countStrAsAlphabets(String s) {
        int[] countStr = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            countStr[s.charAt(i) - 'a']++;
        }
        
        return countStr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String a = input.nextLine();
        String b = input.nextLine();
        
        int[] countA = countStrAsAlphabets(a);
        int[] countB = countStrAsAlphabets(b);

        int answer = 0;

        for(int i = 0; i < 26; i++) {
            if(countA[i] != countB[i]) answer += Math.abs(countA[i] - countB[i]);
        }
        
        System.out.println(answer);
        
    }
}