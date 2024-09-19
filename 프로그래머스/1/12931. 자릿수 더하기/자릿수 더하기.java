public class Solution {
    public int solution(int n) {
        int answer = 0;

        answer = String.valueOf(n).chars().map(Character::getNumericValue).sum();
        
        return answer;
    }
}