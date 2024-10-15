import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        Queue<Integer> queue = new LinkedList<>();
        int pollCount = 0;
        //5 10 1 1 20 1
        for(int i = 0; i < speeds.length; i++) {
            int leftDay = 0;
            leftDay += (100 - progresses[i]) / speeds[i];
        
            if ((100 - progresses[i]) % speeds[i] != 0) leftDay += 1;
            
            if (queue.isEmpty()) {
                queue.add(leftDay);
                pollCount++;
                //최초의 수를 넣어줌.
                //5
                
            } else if (queue.peek() < leftDay) {
                for(int j = 0; j < pollCount; j++) {
                    queue.poll();
                }
                queue.add(leftDay);
                arrayList.add(pollCount);
                pollCount = 1;
                
            } else if (queue.peek() >= leftDay) {
                pollCount++;
                queue.add(leftDay);
            }
        }
        
        arrayList.add(queue.size());
        
        int[] answer = new int[arrayList.size()];
        
        for(int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        // System.out.println(arrayList.toString());
        // System.out.println(queue.toString());
        return answer;
    }
}
