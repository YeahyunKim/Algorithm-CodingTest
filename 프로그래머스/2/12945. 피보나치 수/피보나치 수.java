class Solution {
    public int solution(int n) {
        long[] nArr = new long[n+1];
        
        nArr[0] = 0;
        nArr[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            nArr[i] = (nArr[i-1] + nArr[i-2]) % 1234567;
        }
        
        // int answer = (int) (nArr[nArr.length -1] % 1234567L);
        
        return (int) nArr[nArr.length-1];
    }
}

