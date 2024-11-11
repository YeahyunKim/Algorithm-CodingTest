import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        while(input.hasNextInt()) {
            arrayList.add(input.nextInt());                            
        }
        
        for(int num : arrayList) {
            if(max < num) {
                max = num;
            }
        }
        
        System.out.println(max);
        System.out.println(arrayList.indexOf(max) + 1);
    }
}