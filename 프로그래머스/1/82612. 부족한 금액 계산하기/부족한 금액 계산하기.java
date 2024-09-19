import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        long totalMoney = 0;
        long answer = 0;

        for (long i = 1; i <= count; i++) {
            totalMoney += price * i;
        }

        answer = money - totalMoney;
        
        return answer > 0 ? 0 : Math.abs(answer);
    }
}

//3 17
//6 11
//9 2
//12 2 (10원 부족)