import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        
        ArrayList<String> wordList = new ArrayList<>();

        String[] arrStr = words[0].split("");
        String lastWord = arrStr[arrStr.length - 1]; // K
        
        for(int i = 0; i < words.length; i++) {
            
            
            String[] wordArr = words[i].split("");
            String firstWord = wordArr[0]; // K
            
            if(wordList.size() == 0) {
                wordList.add(words[i]);
            } else {
            
            
                if (wordList.contains(words[i])) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }
                else if (!lastWord.equals(firstWord)) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                } 
                lastWord = wordArr[wordArr.length - 1];
                wordList.add(words[i]);
                
                
                System.out.println(lastWord + ", " + firstWord);
            }
              
   


                // if ()
    
        }

        return answer;
    }
}