import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] charArray = my_string.toCharArray();
        for(int indice : indices) {
            charArray[indice] = ' ';
        }
        
        for(char c : charArray) {
            if (c != ' ') {
                answer += c;
            }
        }
        
        
        return answer;
    }
}