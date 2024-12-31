import java.util.*;

class Solution {
    static ArrayList<String> arrayList = new ArrayList<>();
    static boolean[] visited;
    
    public String[] solution(String[][] tickets) {
        
        
        visited = new boolean[tickets.length];
        
        dfs(0, "ICN", "ICN", tickets);
        
        Collections.sort(arrayList);
        
        String[] answer = arrayList.get(0).split(" ");
        
        return answer;
    }
    
    public static void dfs(int travelCount, String recent, String prev, String[][] tickets) {
        if(travelCount == visited.length) {
            arrayList.add(prev);
            return;
        }
        
        for(int i = 0; i < visited.length; i++) {
            String newRecent = tickets[i][1];
            
            if(!visited[i] && recent.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(travelCount + 1, newRecent, prev + " " + newRecent, tickets);
                visited[i] = false;
            }
        }
    }
}

