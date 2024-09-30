import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        String temp = "";
        Map<String, Integer> hashMap = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            hashMap.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++) {
            int currentRank = hashMap.get(callings[i]);
            
            temp = players[currentRank - 1];
            
            players[currentRank] = temp;
            players[currentRank-1] = callings[i];
            
            hashMap.put(players[currentRank], currentRank);
            hashMap.put(players[currentRank-1], currentRank-1);
            
        }
        
        
        
        
        return players;
    }
}