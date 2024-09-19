class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int addNum = 0;

        String xStr = String.valueOf(x);

        addNum = String.valueOf(x).chars().map(Character::getNumericValue).sum();


        answer = x % addNum == 0;
        

        return answer;
    }
}