class Solution {
    public int solution(int n) {
        int[] nArr = new int[n+1];
        nArr[0] = 0;
        nArr[1] = 1;
        
        for(int i = 2; i < nArr.length; i++) {
            nArr[i] = (nArr[i-1] + nArr[i-2]) % 1234567;
        }
        
        return nArr[n];

    }
}
