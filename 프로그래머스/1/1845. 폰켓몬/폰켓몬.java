import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length / 2;
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for(int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());   
        }
        
        
        if(hashMap.size() > n) {
            answer = n;
        } else {
            answer = hashMap.size();
        }
        
        return answer;
        
        // 1 / 3
        // 2 / 1
        // 3 / 2
        // 4 / 3
    }
}