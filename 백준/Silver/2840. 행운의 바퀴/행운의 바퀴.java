import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ARRAYSIZE = input.nextInt();
        int PLAYTIME = input.nextInt();
        
        String[] array = new String[ARRAYSIZE];
        
        int now = 0;
        boolean isEmpty = true;
        for(int i = 0; i < PLAYTIME; i++) {
            int rotation = input.nextInt();
            String result = input.next();
            
            now += rotation;
            
            if(array[now % ARRAYSIZE] == null) {
                if(!isContain(array, result)) {
                    array[now % ARRAYSIZE] = result;   
                } else {
                    isEmpty = false;
                    break;                     
                }
            } else if(!array[now % ARRAYSIZE].equals(result)) {
                isEmpty = false;
                break;   
            }
        }
        if(!isEmpty) {
            System.out.println("!");
        } else {
            for(int i = now % ARRAYSIZE; i >= 0; i--) {
                if(array[i] == null) {
                    System.out.print("?");
                } else {
                    System.out.print(array[i]);
                }
            }
            for(int i = ARRAYSIZE - 1; i > now % ARRAYSIZE; i--) {
                if(array[i] == null) {
                    System.out.print("?");
                } else {
                    System.out.print(array[i]);
                }
            }
        }
        
    }

    public static boolean isContain(String[] array, String s) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] != null && array[i].equals(s)) {
                return true;   
            }
        }
        return false;
    }
}