import java.util.*;
class Solution {
    public int solution(int []A, int []B) {
        Integer[] wrapperIntB = new Integer[B.length];
        
        
        for(int i = 0; i < B.length; i++) {
            wrapperIntB[i] = B[i];
        }
        
        
        Arrays.sort(A);
        Arrays.sort(wrapperIntB, Collections.reverseOrder());
        
        for(int i = 0; i < B.length; i++) {
            B[i] = wrapperIntB[i];
        }
        
        int answer = 0;
        
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
    
    
}
    