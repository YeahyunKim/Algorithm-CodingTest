import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int S = input.nextInt();
        input.nextLine();
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        String[] array = new String[N];
        
        for(int i = 0; i < N; i++) {
            array[i] = input.nextLine();
        }
        
        for(int i = 0; i < S; i++) {
            String s = input.nextLine();
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }
        int answer = 0;
        
        for(String s : array) {
            if(hashMap.containsKey(s)) {
                answer += hashMap.get(s);   
            }
        }
        
        System.out.print(answer);
    }   
}