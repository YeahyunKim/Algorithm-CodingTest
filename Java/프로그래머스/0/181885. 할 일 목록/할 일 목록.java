import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> str = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++) {
            if(finished[i] == false) {
                str.add(todo_list[i]);
            }
        }
        
        String[] answer = new String[str.size()];
        //answer = [null, null]
        //str = ["practiceguitar", "studygraph"]
        
        for(int i = 0; i < str.size(); i++) {
            answer[i] = str.get(i);
        }
        
        return answer;
    }
}