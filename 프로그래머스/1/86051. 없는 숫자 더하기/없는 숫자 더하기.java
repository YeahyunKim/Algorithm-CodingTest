class Solution {
    public int solution(int[] numbers) {
        int addNum = 0;

        for(int n : numbers) {
            addNum += n;
        }


        return 45-addNum;
    }
}