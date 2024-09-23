import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        //뭐가 잘못된건데 ?
        HashSet<Integer> arrInt = new HashSet<>();
        int index = 0;

        for(int i = 0; i < numbers.length-1; i++) { //4번
            for(int j = i + 1; j < numbers.length; j++) { //3번
                arrInt.add(numbers[i] + numbers[j]);
            }
        }
        

        int[] answer = new int[arrInt.size()];
        for(int sum : arrInt) {
            answer[index++] = sum;
        }

        Arrays.sort(answer);
        return answer;
    }
}