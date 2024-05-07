import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        
        for (long i = 0; i < n; i++) {
            answer[(int)i] = (i+1) * num;
        }
        return answer;
        
    }
}
//10,000,000000
// 2,147,483,647