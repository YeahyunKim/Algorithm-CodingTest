import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        // [3, 10, 28]
        int answer = 0;
        Arrays.sort(array);
        
        for(int i = 1; i < array.length; i++) {
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])) {
                array[0] = array[i];
            }            
        }
        answer = array[0]; 
        
        return answer;

    }
}