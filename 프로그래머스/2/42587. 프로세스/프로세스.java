import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        ArrayList<Integer> arrayListSort = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        int answer = 0;
        
        location = location + 1;
        
        for(int i : priorities) {
            queue.add(i);
        }
        
        while(location > 0) {
            int maxValue = maxValue(queue); //9
            int pollNum = queue.poll(); // 1
            if(maxValue > pollNum) {
                queue.add(pollNum); // 1 9 1 1 1 1
                location--; // 0
                if(location == 0) {
                    location = location + queue.size(); // 6
                }
            } else {
                answer++;
                location--;
            }
            
            if (location == 0) {
                return answer;
            }
        }
        
        System.out.println(maxValue(queue));
       
        return answer;
    }
    
    public static int maxValue(Queue<Integer> queue) {
        int maxValue = 1;
        for(int value : queue) {
            if(maxValue < value) maxValue = value;
        }
        
        return maxValue;
    }
}




