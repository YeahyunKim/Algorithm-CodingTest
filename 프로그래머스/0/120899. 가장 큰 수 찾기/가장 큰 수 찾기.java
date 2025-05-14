import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        
        Arrays.sort(array);
        
        answer[0] = array[array.length-1];
        
        for(int i = 0; i < arrayCopy.length; i++) {
            if(arrayCopy[i] == array[array.length-1]) {
                answer[1] = i;
                break;
            }
        }
    
        
        return answer;
    }
}