import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger n = BigInteger.ONE;
        BigInteger l = BigInteger.ONE;
        BigInteger m = BigInteger.ONE;

        // n = balls!
        for (int i = balls; i > 0; i--) {
            n = n.multiply(BigInteger.valueOf(i));
        }

        // l = (balls - share)!
        for (int i = (balls - share); i > 0; i--) {
            l = l.multiply(BigInteger.valueOf(i));
        }

        // m = share!
        for (int i = share; i > 0; i--) {
            m = m.multiply(BigInteger.valueOf(i));
        }

        // answer = n / (l * m)
        BigInteger answer = n.divide(l.multiply(m));

        return answer.intValue(); // 결과를 int로 변환하여 반환
    }
}
