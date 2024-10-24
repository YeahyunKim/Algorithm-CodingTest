import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for(String s : participant) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);   
        }
        
        for(String s : completion) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) - 1);
        }
        
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() != 0) {
                answer = entry.getKey();
            }
        }

        
        return answer;
    }
}