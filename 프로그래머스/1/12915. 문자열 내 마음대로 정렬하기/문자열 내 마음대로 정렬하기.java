import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        
        for(int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        
        Collections.sort(arrayList);
        
        for(int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i).substring(1);
        }

        return answer;

    }
}