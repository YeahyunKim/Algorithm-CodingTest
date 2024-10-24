import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
        
        for(int i = 0; i < topping.length; i++) {
            hashMap1.put(topping[i], hashMap1.getOrDefault(topping[i], 0) + 1);
        }
        
        for(int i = 0; i < topping.length; i++) {
            hashMap2.put(topping[i], hashMap2.getOrDefault(topping[i], 0) + 1);
            hashMap1.put(topping[i], hashMap1.getOrDefault(topping[i], 0) - 1);
            
            if(hashMap1.get(topping[i]) == 0) {
                hashMap1.remove(topping[i]);
            }
            
            if(hashMap1.size() == hashMap2.size()) answer++;

        }
        

        return answer;
    }
}
