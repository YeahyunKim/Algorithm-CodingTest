import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[(start_num - end_num) + 1];
        List<Integer> list = new ArrayList<>();
        
        for(int i = start_num; i >= end_num; i--) {
            list.add(i);
        }
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}