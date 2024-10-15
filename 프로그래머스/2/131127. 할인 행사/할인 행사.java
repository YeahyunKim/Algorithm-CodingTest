import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int membershipCount = discount.length - 10;
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        boolean isPossibleGetWant = false;
        
        
        for(int i = 0; i <= membershipCount; i++) {
            for(int j = 0; j < 10; j++) {
                hashMap.put(discount[j+i], hashMap.getOrDefault(discount[j+i], 0) + 1);
            }
            // System.out.println(hashMap.toString());
            
            for(int j = 0; j < want.length; j++) {
                if (hashMap.get(want[j]) != null) {
                    if(number[j] > hashMap.get(want[j])) {
                        isPossibleGetWant = false;
                        break;
                    } else {
                        // System.out.println("true");
                        isPossibleGetWant = true;
                        continue;
                    }  
                } else {
                    isPossibleGetWant = false;
                    break;
                }

            }
            // System.out.println(hashMap.get(want[0]));
            
            if(isPossibleGetWant) answer++;
            
            hashMap.clear();    
            
        }
        return answer;
    }
}

// 바나나 3
// 사과 2
// 쌀 2
// 돼지고기 2
    
// 지수와 로그

// ["chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"]