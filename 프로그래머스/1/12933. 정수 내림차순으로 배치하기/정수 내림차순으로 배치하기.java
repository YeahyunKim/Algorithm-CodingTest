import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String nStr = Long.toString(n);
        
        char[] nChar = nStr.toCharArray();
        
        Arrays.sort(nChar);
        
        String sortedStr = new StringBuilder(new String(nChar)).reverse().toString();
        
        
        return Long.parseLong(sortedStr);
    }
}