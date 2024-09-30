import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] mbtiChar = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        for(int i = 0; i < mbtiChar.length; i++) {
            hashMap.put(mbtiChar[i], 0);
        }
        
        for(int i = 0; i < survey.length; i++) {
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);
            
            if (choices[i] == 4) { // 모르겠음 선택 시, 넘어가기
                continue;
            } else if (choices[i] < 4) { // 비동의 쪽 선택 시
                hashMap.put(first, hashMap.get(first) + (4 - choices[i]));
            } else if (choices[i] > 4) { // 동의 쪽 선택 시
                hashMap.put(second, hashMap.get(second) + (choices[i] - 4));
            }
        }
        
        for(int i = 0; i < mbtiChar.length; i += 2) {
            char first = mbtiChar[i];
            char second = mbtiChar[i+1];
            
            answer += hashMap.get(first) >= hashMap.get(second) ? first : second;
        }
            
            
        return answer;
    }
}



//R T
//C F
//J M
//A N