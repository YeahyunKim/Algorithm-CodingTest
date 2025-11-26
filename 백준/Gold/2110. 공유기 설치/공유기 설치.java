import java.util.*;

public class Main {
    static int N, M;
    static int[] array;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        N = input.nextInt();
        M = input.nextInt();
        
        array = new int[N];
        
        for(int i = 0; i < N; i++) {
            array[i] = input.nextInt();
        }
        
        Arrays.sort(array);
        
        System.out.println(getDistance());
        
    }
    
    
    public static int getDistance() {
        int l = 1;
        int r = array[array.length - 1] - array[0];
        int answer = 0;

        while(l <= r) {
            int distance = (l + r) / 2;
            
            if(isPossible(distance)) {
                answer = distance;
                l = distance + 1;
            } else {
                r = distance - 1;
            }
        }
        return answer;
    }
    
    public static boolean isPossible(int distance) {
        // M = count 설치해야 하는 공유기 개수인걸 잊으면 안됨
        // 즉, count >= M true else false
        
        int firstHouseLocation = array[0];
        int count = 1;
        
        for(int i = 1; i < array.length; i++) {
            if(array[i] - firstHouseLocation >= distance) {
                firstHouseLocation = array[i];
                count++;
            }
        }
        return count >= M;
    }
}