class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int start = 1;
        for(int i  = 0; i < prices.length; i++) {
           while(start <= prices.length - 1) {
               if(prices[i] <= prices[start]) {
                   answer[i]++;
                   start++;
               } else {
                   answer[i]++;
                   break;
               }
           }
            start = i+2;
        }
        
        return answer;
    }
}