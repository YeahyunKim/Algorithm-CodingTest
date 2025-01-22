
import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";

        BigInteger aNum = new BigInteger(a);
        BigInteger bNum = new BigInteger(b);
        
        BigInteger sum = aNum.add(bNum);
        
        answer = sum.toString();
        
        return answer;
    }
}