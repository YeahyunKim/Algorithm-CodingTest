import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String a = input.nextLine();
        String b = input. nextLine();

        int answer = 0;
        int count = 0;
        
        int pointer = 0;
        int index = 0;
        while(a.length() - pointer >= b.length()) {
            int charCount = 0;
            for(int i = 0; i < b.length(); i++) {
                if(a.charAt(pointer) == b.charAt(i)) {
                    charCount++;
                    pointer++;
                }
            }
            
            if(charCount == b.length()) {
                answer++;
                index = pointer;
            } else {
                index++;
                pointer = index;
            }
        }
        
        System.out.println(answer);
        
    }
}