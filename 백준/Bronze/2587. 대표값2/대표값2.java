import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] n = new int[5];
        int average = 0;
        for(int i = 0; i < 5; i++) {
            int a = input.nextInt();
            average += a;
            n[i] = a;
        }
        
        Arrays.sort(n);
        System.out.println(average / 5);
        System.out.println(n[2]);
    }
}