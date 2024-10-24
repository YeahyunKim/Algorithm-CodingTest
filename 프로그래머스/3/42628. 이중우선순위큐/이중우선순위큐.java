import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        
        for(int i = 0; i < operations.length; i++) {
            if(operations[i].contains("I")) {
                heap.add(Integer.parseInt(operations[i].substring(2)));
            } else if (!heap.isEmpty() && operations[i].contains("D 1")) {
                int maxValue = Integer.MIN_VALUE;
                for(int value : heap) {
                    maxValue = Math.max(maxValue, value);
                }
                heap.remove(maxValue);
            } else if (!heap.isEmpty() && operations[i].contains("D -1")) {
                heap.poll();
            }
        }
        
        if(heap.size() == 0) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            int maxValue = Integer.MIN_VALUE;
            for(int value : heap) {
                maxValue = Math.max(maxValue, value);
            }
            answer[0] = maxValue;
            answer[1] = heap.poll();
        }
        
        
        // System.out.println(heap);
        return answer;
    }
}