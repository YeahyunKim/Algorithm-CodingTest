import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i : tangerine) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        
        Collection<Integer> values = hashMap.values();
        
        ArrayList<Integer> list = new ArrayList<>(hashMap.values());
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i : list) {
            answer++;
            k = k - i;
            if (k <= 0) {
                break;
            }
        }
    
        return answer;
    }
}
