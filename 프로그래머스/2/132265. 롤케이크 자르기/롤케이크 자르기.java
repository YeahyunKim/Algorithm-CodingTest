import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
        
        // 전체 토핑의 수를 hashMap2에 저장
        for (int t : topping) {
            hashMap2.put(t, hashMap2.getOrDefault(t, 0) + 1);
        }

        int uniqueCount1 = 0; // 첫 번째 부분의 고유한 토핑 수
        int uniqueCount2 = hashMap2.size(); // 두 번째 부분의 고유한 토핑 수

        for (int i = 0; i < topping.length; i++) {
            // 첫 번째 부분에 토핑 추가
            int currentTopping = topping[i];
            hashMap1.put(currentTopping, hashMap1.getOrDefault(currentTopping, 0) + 1);
            if (hashMap1.get(currentTopping) == 1) {
                uniqueCount1++;
            }

            // 두 번째 부분에서 토핑 제거
            if (hashMap2.get(currentTopping) != null) {
                hashMap2.put(currentTopping, hashMap2.get(currentTopping) - 1);
                if (hashMap2.get(currentTopping) == 0) {
                    hashMap2.remove(currentTopping);
                    uniqueCount2--;
                }
            }

            // 고유한 토핑 수가 같으면 카운트 증가
            if (uniqueCount1 == uniqueCount2) {
                answer++;
            }
        }

        return answer;
    }
}
