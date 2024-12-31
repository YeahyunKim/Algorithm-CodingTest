import java.util.*;

public class Main{
    public static void main(String[] args) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        
        for(int i = 0; i < alphabets.length(); i++) {
            if(s.contains(String.valueOf(alphabets.charAt(i)))) {
                if (i == alphabets.length() - 1) {
                    System.out.print(s.indexOf(String.valueOf(alphabets.charAt(i))) + "");
                } else {
                    System.out.print(s.indexOf(String.valueOf(alphabets.charAt(i))) + " ");
                }

            } else {
                if (i == alphabets.length() - 1) {
                    System.out.print(-1 + "");
                } else {
                    System.out.print(-1 + " ");
                }
            }
        }
    }
}