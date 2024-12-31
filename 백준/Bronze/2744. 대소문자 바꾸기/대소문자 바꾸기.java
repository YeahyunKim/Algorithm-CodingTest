import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String str = input.nextLine();
        
        for(char s : str.toCharArray()) {
            if(Character.isUpperCase(s)) {
                System.out.print(Character.toLowerCase(s));
            } else {
                System.out.print(Character.toUpperCase(s));
            }
        }
    }
}