import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isFirstWord = true;
        for(char c : s.toCharArray()) {
            if(isFirstWord && c != ' ') {
                answer.append(Character.toUpperCase(c));
                isFirstWord = false;
            } else {
                if (c == ' ') { 
                    answer.append(c);
                    isFirstWord = true;
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }
        return answer.toString();
    }
}