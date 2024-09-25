import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String total = "";
        String[] answer = new String[n];
        // Arrays.fill(answer, "");
        for(int i = 0; i < arr1.length; i++) {
            
            //개발 접습니다 ㅅㄱ하세요.

            total = "";
            String arr1Binary = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String arr2Binary = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            
            for(int j = 0; j < arr1Binary.length(); j++) {
                if(arr1Binary.charAt(j) == '1' || arr2Binary.charAt(j) == '1') {
                    total += "1";
                } else if(arr1Binary.charAt(j) == '0' && arr2Binary.charAt(j) == '0') {
                    total += "0";
                }    
            }
            
            
            
            // total = String.valueOf(Integer.parseInt(arr1Binary) + Integer.parseInt(arr2Binary));
            
//             if (total.length() < n) {
//                 for(int j = 0; j < n-total.length(); j++) {
//                     total = '0' + total;    
//                 }
                
//             }
            
            answer[i] = "";
            
            for(char c : total.toCharArray()) {
                
                if(c != '0') {
                    answer[i] += "#";
                }
                
                if(c == '0') {
                    answer[i] += " ";
                }
            }
            
            System.out.println(total);
        }
        
        
        //홀수면, 168421
        
        return answer;
    }
}