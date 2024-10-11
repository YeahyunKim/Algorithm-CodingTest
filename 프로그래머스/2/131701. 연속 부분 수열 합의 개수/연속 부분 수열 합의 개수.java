import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        int start = 1;
        
        while(start <= elements.length) {
            for (int i = 0; i < elements.length; i++) {
                int value = 0;
                
                for(int j = i; j < i + start; j++) {
                    value += elements[j % elements.length];
                }
                
                hashSet.add(value);
            }
            start++;
        }
        return hashSet.size();
    }
}

