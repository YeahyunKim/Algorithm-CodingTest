import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        
        boolean isFirst = true;
        
        for(int i = 0; i < charArr.length; i++) {
            if(isFirst) {
                answer += Character.toUpperCase(charArr[i]);
                if (charArr[i] == ' ') {
                    isFirst = true;    
                } else {
                    isFirst = false;
                }
            } else if (charArr[i] == ' '){
                answer += charArr[i];
                isFirst = true;
            } else {
                answer += Character.toLowerCase(charArr[i]);
            }
        }
        
        return answer;
    }
}