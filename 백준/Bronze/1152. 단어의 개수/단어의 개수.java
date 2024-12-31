import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String s = input.nextLine();
        
        String[] sList = s.trim().split(" ");
        if(sList[0].equals("")) {
            System.out.println(0);    
        } else {
            System.out.println(sList.length);
        }
       
    }
}