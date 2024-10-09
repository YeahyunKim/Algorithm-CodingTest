import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        ArrayList<Integer> measureList = new ArrayList<>();
        for(int i = 1; i <= brown + yellow; i++) {
            if (total % i == 0) {
                measureList.add(i); // 총 카펫 개수의 약수
            }
        }
        for(int i = 0; i < measureList.size(); i++) {
            int maxIndex = measureList.size() - 1;
            if(measureList.get(maxIndex - i) * measureList.get(i) == total && 
              (measureList.get(maxIndex - i) - 2) * (measureList.get(i) - 2) == yellow &&
              measureList.get(maxIndex - i) >= measureList.get(i)) {
                answer[0] = measureList.get(maxIndex - i);
                answer[1] = measureList.get(i);
            }
        }
        return answer;
    }
}
