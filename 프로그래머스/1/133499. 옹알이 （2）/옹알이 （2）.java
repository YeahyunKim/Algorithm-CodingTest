import java.util.*;

class Solution {
    public int solution(String[] babbling) {
                int answer = 0;
        String[] say = {"aya", "ye", "woo", "ma"};
        String[] notSay = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(int i = 0; i < babbling.length; i++) {
            for(String not : notSay) {
                if(babbling[i].contains(not)){
                    babbling[i] += "1";
                }
            }
            for(int j = 0; j < say.length; j++) {
                babbling[i] = babbling[i].replace(say[j], "0");
            }
        }
        
        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("0", "");
            if (babbling[i].equals("")) answer++;
        }
        
        return answer;
    }
}