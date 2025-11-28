import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        int[] array = new int[N];
        
        for(int i = 0; i < N; i++) {
            if(i == 0) array[i] = input.nextInt();
            else array[i] += array[i-1] + input.nextInt();
        }
        
        int p1 = 0;
        int p2 = 1;
        int answer = 0;

        while(p1 < p2 && p2 < N) {
            int rightNum = array[p2] - array[p1];
            int leftNum = array[N-1] - rightNum;
            
            
//            System.out.print(rightNum + " : " + leftNum);
            answer = Math.max(answer, Math.min(rightNum, leftNum));
            
            if(rightNum > leftNum) {
                p1++;
            } else {
                p2++;
            }

        }
        
        System.out.print(answer);
    }
}