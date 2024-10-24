import java.util.*;

        
//1. ArrayList를 만들어서 Sort처리
//2. 처리한 ArrayList에서 가장 낮은수 + 두번째 낮은 수를 통하여 새로운 배열 만들기
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num : scoville) {
            heap.add(num);   
        }
        
        for(int i = 0; i < scoville.length - 1; i++) {
            if (heap.peek() < K) {
                heap.add(mixScoville(heap.poll(), heap.poll()));
                answer++;
            } else {
                break;
            }
        }
        if (heap.peek() < K) {
            answer = -1;
        }
        
        return answer;
    }
    public static int mixScoville(int a, int b) {
        return (a + b * 2);
    }

}