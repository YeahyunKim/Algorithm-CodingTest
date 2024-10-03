import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splitStr = s.split(" ");
        int[] intArr = new int[splitStr.length];
        
        
        for(int i = 0; i < splitStr.length; i++) {
            intArr[i] = Integer.parseInt(splitStr[i]);        
        }
        
        int sTemp = intArr[0];
        int bTemp = intArr[0];
        
        for(int i = 1; i < intArr.length; i++) {
            
            if (sTemp > intArr[i]) {
                sTemp = intArr[i];
            }
            
            if (bTemp < intArr[i]) {
                bTemp = intArr[i];
            }
        }
        
        answer += String.valueOf(sTemp);
        answer += " ";
        answer += String.valueOf(bTemp);
        return answer;
    }
}