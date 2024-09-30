import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        String temp = "";
        
        for(int i = 0; i < players.length; i++) {
            hashMap.put(players[i], i);
        }
        
        for(String s : callings) {
            int ranking = hashMap.get(s);
            
            temp = players[ranking-1];
            
            players[ranking-1] = players[ranking];
            players[ranking] = temp;
            
            hashMap.put(temp, ranking);
            hashMap.put(s, ranking-1);
            
        }

        return players;
    }
}