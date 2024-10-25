import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> wordList = new ArrayList<>();
        
        for(int i = 0; i < words.length; i++) {
            
            //처음 플레이는 페스
            if(i != 0) {
                String firstWord = words[i].charAt(0) + "";
                String lastWord = words[i - 1].charAt(words[i - 1].length() - 1) + "";
                if(wordList.contains(words[i])) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                } else if (!firstWord.equals(lastWord)) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }
            }
            wordList.add(words[i]);
            
            
        }
        
        return answer;
    }
}