import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        StringBuilder sb = new StringBuilder();
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for(String s : participant) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }
        
        for(String s : completion) {
            hashMap.put(s, hashMap.get(s) - 1);
        }
        
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == 1) {
                sb.append(entry.getKey());
            }
        }
        
        return sb.toString();
    }
}