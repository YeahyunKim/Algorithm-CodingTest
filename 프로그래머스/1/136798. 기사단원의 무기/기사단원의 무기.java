import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisor = new int[number + 1]; // 1부터 number까지 사용하므로 크기를 number + 1로 설정
        
        // 약수 카운트 (O(n√n) 복잡도)
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisor[j]++;
            }
        }
        
        // 약수 수에 따라 answer 계산
        for (int i = 1; i <= number; i++) {
            if (divisor[i] > limit) {
                answer += power;
            } else {
                answer += divisor[i];
            }
        }
        
        return answer;
    }
}