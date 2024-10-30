class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer -= (n / 10) * 2000;
        answer += 12000 * n + 2000 * k;
        return answer;
    }
}