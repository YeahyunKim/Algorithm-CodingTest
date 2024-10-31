import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        char[] alphabets = new char[26];
        for(int i = 0; i < 26; i++) {
            if(i != 25) {
                System.out.print(S.indexOf((char)(i+97)) + " ");   
            } else {
                System.out.print(S.indexOf((char)(i+97)));
            }
        }
    }
}