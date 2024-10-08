import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(stack.isEmpty()) {
                stack.push(c);
            } else {
                if(stack.peek() == '(' && c == ')') {
                    stack.push(c);
                    stack.pop();
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            
            
        }
        return stack.isEmpty() ? true : false;
        
    }
}


// ((