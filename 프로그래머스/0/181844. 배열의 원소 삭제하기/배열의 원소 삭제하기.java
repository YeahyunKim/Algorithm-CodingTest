import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }
        
        for(int d : delete_list) {
            int index = answer.indexOf(d);
            
            if(index != -1)  answer.remove(index);
        }

        
        return answer;
        
    }
}