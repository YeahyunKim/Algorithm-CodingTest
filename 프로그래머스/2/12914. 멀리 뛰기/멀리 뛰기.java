class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] fibonacciArray = new long[n+1];
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 2;
        
        for(int i = 2; i < n; i++) {
            fibonacciArray[i] = (fibonacciArray[i-1] +  fibonacciArray[i-2])% 1234567;
        }
        
        answer = fibonacciArray[n-1];
        return answer;
    }
    
}