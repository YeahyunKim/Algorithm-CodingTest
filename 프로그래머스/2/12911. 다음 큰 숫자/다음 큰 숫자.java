class Solution {
    public int solution(int n) {
        String binaryStr = "";
        int count = 0;
        int nCount = 0;
        int answer = 0;
        
        binaryStr = Integer.toBinaryString(n);
        
        for(char c : binaryStr.toCharArray()) {
            if(c == '1') {
                count++;
            }
        }
        
        while(answer == 0) {
            n++;
            binaryStr = Integer.toBinaryString(n);
            for(char c : binaryStr.toCharArray()) {
                if(c == '1') {
                    nCount++;
                }
            }
            
            if(count == nCount) {
                answer = n;
            } else {
                nCount = 0;
            }
            
        }
        
        return answer;
    }
}
