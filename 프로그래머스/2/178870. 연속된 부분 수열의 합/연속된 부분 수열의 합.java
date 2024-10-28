import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0;
        int right = 0;
        int sum = 0;
        int gap = sequence.length;
        
        
        for(int i = right; right < sequence.length; right++){
            sum += sequence[right];
            
            while(right < sequence.length && sum > k) {
                sum -= sequence[left++];
            }
            
            if(sum == k) {
                if(gap > right - left) {
                    gap = right - left;
                    answer[0] = left;
                    answer[1] = right;
                }
            }
        }

        return answer;
    }
}