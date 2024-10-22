import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        
        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] -1;
            System.out.println(start + " // " + end);
            
            for(int j = start; j <= end; j++) {
                arrayList.add(array[j]);
            }
            
            Collections.sort(arrayList);
            
            answer[i] = arrayList.get(commands[i][2] - 1);
            
            arrayList.clear();
        }
        
        
        
        return answer;
    }
}