import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr) {
            if(stack.isEmpty()) {
                stack.push(i);
            } else {
                if (stack.peek() == i) {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }
        
        if (stack.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}