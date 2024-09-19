import java.util.*;
import java.util.Collections;

class Solution {
    public String solution(String s) {

        // 자바 안함 ㅋㅋ ㅅㄱ..
        // 쓰레기 언어누 ㅋㅋ 
        // 뭑 이렇게 안되는게 많아 ㅋㅋ

        String answer = "";

        Character[] charStr = new Character[s.length()];
        
        
        for(int i = 0; i < s.length(); i++) {
            charStr[i] = s.charAt(i);
        }

        Arrays.sort(charStr, Collections.reverseOrder());

        StringBuilder sortedString = new StringBuilder();
        for(char c : charStr) {
            sortedString.append(c);
        }
        
        return sortedString.toString();
    }
}