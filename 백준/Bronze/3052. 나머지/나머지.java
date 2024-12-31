import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        
        int N = 10; 
        
        for(int i = 0; i < N; i++) {
            int x = input.nextInt();
            
            hashSet.add(x % 42);
        }
        System.out.println(hashSet.size());
    }
}