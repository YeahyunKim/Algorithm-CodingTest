import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> sumList = new ArrayList<>();
        int divideCount = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length-1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    sumList.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        
        for(int sum : sumList) {
            divideCount = 0;
            for(int i = 1; i <= sum; i++) {
                if (sum % i == 0) {
                    divideCount++;
                }
            }
            if (divideCount == 2) {
                answer++;
            }
        }
        System.out.println(sumList.toString());
        return answer;
    }
}