import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for(int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            
        }
        
        return Math.min(hashMap.size(), nums.length / 2);
    }
}