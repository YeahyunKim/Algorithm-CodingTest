import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int[] totalBox = new int[order.length];
        Queue<Integer> queue = new LinkedList<>(); //트럭
        Stack<Integer> stack = new Stack<>(); //보조 컨테이너벨트

        for(int i = 0; i < order.length; i++) {
            queue.add(i+1);
        }
        
        
        for(int i = 0; i < order.length; i++) {
            if(!queue.isEmpty() && queue.peek() != order[i]) {
                
                for(int j = queue.peek(); j < order[i]; j++) {
                    stack.add(j);
                    queue.poll();
                }
                
                if(queue.peek() == order[i]) {
                    queue.poll();
                    answer++;   
                } else if (stack.peek() == order[i]) {
                    stack.pop();
                    answer++;
                } else if (stack.peek() != order[i] && queue.peek() != order[i]) {
                    break;
                }
                
                // System.out.println(i);
                // System.out.println("상자 순서 = " + queue);
                // System.out.println("보조 순서 = " + stack);
            } else {
                queue.poll();
                answer++;
                // System.out.println("상자 순서 = " + queue);
                // System.out.println("보조 순서 = " + stack);
            }
        }
        
        // System.out.println(queue);
        
        return answer;
    }
}

//1. 트럭에 물건을 싣기 전에 order 박스 번호 확인
//2. order박스 번호에 아랫 숫자들을 보조 컨테이너 벨트에 넣기
//3. order[1] 두번째 박스의 번호와 보조 컨테이너 벨트의 peek()값이 같은지 확인 후 넣기 -> 같지 않다면 종료