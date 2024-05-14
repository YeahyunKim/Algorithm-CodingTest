class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while (num != 1 && answer != 500) {
            if (num % 2 == 0) { //짝수라면
                num = num / 2;
                answer += 1;
            } else { // 홀수라면
                num = (num * 3) + 1;
                answer += 1;
            }
        }
                
        return answer >= 500 ? -1 : answer;
    }
}