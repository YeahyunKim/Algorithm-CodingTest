import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        
        for(int i = 0; i < s.length(); i++) {
            if(hashMap.get(s.charAt(i)) == null){
                hashMap.put(s.charAt(i), i);
                answer[i] = -1;
            } else {
                answer[i] = i - hashMap.get(s.charAt(i));
                hashMap.put(s.charAt(i), i);
            }
        }
        
        return answer;
    }
}