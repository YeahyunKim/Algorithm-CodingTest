import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        input.nextLine();
        HashMap<Integer, String> hashMap = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        
        for(int i = 1; i <= N; i++) {
            String s = input.nextLine();
            hashMap.put(i, s);
            hashMap2.put(s, i);
        }
        
        for(int i = 0; i < M; i++) {
            String s = input.nextLine();
            
            if(s.charAt(0) >= 49 && s.charAt(0) <= 57) {
                System.out.println(hashMap.get(Integer.parseInt(s)));
            } else {
                System.out.println(hashMap2.get(s));
            }
            
        }
        
    }
}