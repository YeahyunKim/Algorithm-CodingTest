import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] correctCountArr = new int[3];
        // HashSet<Integer> correctCountArr = new HashSet<>();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int index = 0;  
        
        
        for(int ans : answers) {
            if (ans == a[index % a.length]) {
                correctCountArr[0]++;
            }
            
            if (ans == b[index % b.length]) {
                correctCountArr[1]++;
            }
            
            if (ans == c[index % c.length]) {
                correctCountArr[2]++;
            }
            index++;
        }

        int max = Math.max(correctCountArr[0], Math.max(correctCountArr[1], correctCountArr[2]));
        
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i < correctCountArr.length; i++) {
            if(max == correctCountArr[i]) result.add(i+1);
        }
        
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }       
        System.out.println(Arrays.toString(correctCountArr));

        return answer;
    }
}