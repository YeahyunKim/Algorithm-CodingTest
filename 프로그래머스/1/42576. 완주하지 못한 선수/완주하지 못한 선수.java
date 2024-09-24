import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
            String answer = "";
            int index = 1;
//         ArrayList<String> list = new ArrayList<>();
//         ArrayList<String> goalList = new ArrayList<>();
        
//         for(String s : participant){
//             list.add(s);
//         }
        
//         for(String s : completion) {
//             goalList.add(s);
//         }
        
//         for(String goal : goalList) {
//             list.remove(goal);
//         }
        
//         String answer = String.join(", ", list);
        
        
        HashMap<String, Integer> hashMap = new HashMap();
        
        for(String s : participant) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }

        for(String s : completion) {
            hashMap.put(s, hashMap.get(s) -1);
        }
        
        for(String s : hashMap.keySet()) {
            if(hashMap.get(s) > 0) {
                answer = s;
                break;
            }
        }
        
        // for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
        //  System.out.println(entry.getKey() + ", " + entry.getValue());   
        // }
        
        return answer;
    }
}