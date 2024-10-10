import java.util.*;
class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        Integer[] bArr = new Integer[B.length];
        
        for(int i = 0; i < bArr.length; i++) {
            bArr[i] = B[i];
        }
        
        Arrays.sort(A);
        Arrays.sort(bArr, Collections.reverseOrder());
        
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * bArr[i];
        }

        return answer;
    }
    
    
}
    