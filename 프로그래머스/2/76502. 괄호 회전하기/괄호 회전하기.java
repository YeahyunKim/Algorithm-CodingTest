import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int x = 1;
        
        Queue<Character> circularQ = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        
        int xLength = s.length();
        
            
        
        while(x <= s.length()) {
            
            for(char c : s.toCharArray()) {
                if(stack.isEmpty()) {
                    stack.push(c);   
                } else {
                    if (stack.peek() == '[' && c == ']') {
                        stack.pop();
                    }
                    else if (stack.peek() == '{' && c == '}') {
                        stack.pop();
                    }
                    else if (stack.peek() == '(' && c == ')') {
                        stack.pop();
                    }
                    else {
                        stack.push(c);
                    }
                }
            }
            
            
            if(stack.size() == 0) {
                answer++;
            }
            
            
            
            for(char c : s.toCharArray()) { 
                circularQ.offer(c);
            }

            
            circularQ.add(circularQ.poll());

            
            s = ""; 

            
            for(int i = 0; i < xLength; i++) {
                s += circularQ.poll();
            }

            stack.clear();

            x++;
        }
        
    
        return answer;
    }
}