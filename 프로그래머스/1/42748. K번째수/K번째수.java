import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++) {
            arr.clear();
                for(int k = commands[i][0]; k <= commands[i][1]; k++) {
                    arr.add(array[k-1]);
                }
            Collections.sort(arr);
            answer[i] = arr.get(commands[i][2] - 1);
        }

        
        return answer;
    }
}