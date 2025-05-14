import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(stack.isEmpty()) {
                stack.push(a);
            } else {
                if(stack.peek() == ')') {
                    stack.push(a);
                } else {
                    if(a == ')') {
                        stack.pop();
                    } else {
                        stack.push(a);
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}