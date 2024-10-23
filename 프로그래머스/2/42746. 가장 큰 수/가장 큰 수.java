import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] strList = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            strList[i] = numbers[i] + "";
        }
        
        Arrays.sort(strList, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        if(strList[0].equals("0")) {
            return "0";
        }
        
        return String.join("", strList);
    }
}