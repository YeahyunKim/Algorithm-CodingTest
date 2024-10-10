import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr) {
            if(stack.isEmpty()) {
                stack.push(i);
            } else {
                int gcd = gcd(stack.peek(), i);
                int num = stack.peek() * i / gcd;
                stack.pop();
                stack.push(num);
            }
        }
        
        return stack.peek();
        
    }
    
    
    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        
        return gcd(b, (a % b));
    }
}


