import java.util.*;

        
//1. ArrayList를 만들어서 Sort처리
//2. 처리한 ArrayList에서 가장 낮은수 + 두번째 낮은 수를 통하여 새로운 배열 만들기
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int scovilleScore = 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++) {
            minHeap.add(scoville[i]);
        }

        while(!minHeap.isEmpty()) {
            if(minHeap.peek() >= K) {
                return answer;
            }
            if(minHeap.size() <= 1) return -1;
            
            scovilleScore = getScoville(minHeap.poll(), minHeap.poll());
            minHeap.add(scovilleScore);    
            answer++;

        }
        
        return -1;
    }
    public static int getScoville(int a, int b) {
        return (a + (b * 2));
    }
}