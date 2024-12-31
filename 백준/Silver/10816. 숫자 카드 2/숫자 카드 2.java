import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int N = input.nextInt();

        for(int i = 0; i < N; i++) {
            int a = input.nextInt();
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }

        int M = input.nextInt();

        for(int i = 0; i < M; i++) {
            int a = input.nextInt();

            if(hashMap.get(a) == null) {
                sb.append("0").append("\n");
            }else {
                sb.append(hashMap.get(a)).append("\n");
            }
        }
        
        System.out.println(sb);

    }

}