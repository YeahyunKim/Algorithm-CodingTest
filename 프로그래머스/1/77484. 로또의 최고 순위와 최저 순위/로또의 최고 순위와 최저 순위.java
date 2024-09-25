class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correct = 0;
        int zeroCount = 0;
        
        for(int i = 0; i < lottos.length; i++) {
            for(int j = 0; j < win_nums.length; j++){
                if(win_nums[i] == lottos[j]){
                    correct++;
                }
            }
            if(lottos[i] == 0) {
                correct++;
                zeroCount++;
            } 
        }
        answer[0] = 7 - correct;
        answer[1] = 7 - (correct - zeroCount);
        
        if (correct - zeroCount == 1 || correct - zeroCount <= 0) {
            answer[1] = 6;
        }
        
        if (correct == 0) {
            answer[0] = 6;
        }
        
        return answer;
    }
}