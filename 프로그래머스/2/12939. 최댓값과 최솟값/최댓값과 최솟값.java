import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = {};
        sArr = s.split(" ");
        
        int bigTemp = Integer.parseInt(sArr[0]);
        int smallTemp = Integer.parseInt(sArr[0]);
        
        System.out.println(Arrays.toString(sArr));
        
        for(int i = 0; i < sArr.length; i++) {
            if(Integer.parseInt(sArr[i]) > bigTemp) {
                bigTemp = Integer.parseInt(sArr[i]);
            }
            
            if(Integer.parseInt(sArr[i]) < smallTemp) {
                smallTemp = Integer.parseInt(sArr[i]);
            }
            
            
        }
        answer += smallTemp + " " + bigTemp;
        return answer;
    }
}