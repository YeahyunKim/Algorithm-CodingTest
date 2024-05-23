class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            int divisorCount = 0;
            for (int j = 1; j <= i; j++) {
                //약수 찾기
                if (i % j == 0) {
                    divisorCount += 1;
                }
            }
            
            if (divisorCount % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}