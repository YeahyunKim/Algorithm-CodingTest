class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];
        
        for (long i = left; i <= right; i++) {
            long row = i / n; // 행 번호
            long col = i % n; // 열 번호
            answer[(int) (i - left)] = (int) Math.max(row, col) + 1; // 최대값 + 1
        }
        
        return answer;
    }
}
