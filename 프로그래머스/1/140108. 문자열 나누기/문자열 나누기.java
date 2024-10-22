import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        char temp = s.charAt(0);
        for(char c : s.toCharArray()) {
            if(count == 0) {
                temp = c;
            }
            
            if (temp == c) {
                count ++;
            } else {
                count --;
            }
            
            if(count == 0) {
                answer++;
            }
        }
        if (count > 0) {
            answer ++;
        }
        return answer;
    }
}