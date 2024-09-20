import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 1;

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                idx = 1;
            } else {
                idx++;
            }

            answer += idx % 2 == 0 ? String.valueOf(s.charAt(i)).toUpperCase() : String.valueOf(s.charAt(i)).toLowerCase();
        }


        return answer;
    }
}