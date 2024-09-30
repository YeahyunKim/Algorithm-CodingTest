import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
            boolean isCorrect = false;
            Stack<Integer> stack = new Stack<>();
            Stack<Boolean> booleanStack = new Stack<>();



            for(int i = 0; i < ingredient.length; i++) {
                if (stack.isEmpty()) {
                    stack.push(ingredient[i]);
                    if(ingredient[i] == 1) {
                        booleanStack.push(true);
                    } else {
                        booleanStack.push(false);
                    }
                } else {
                    if (stack.peek() == 1) {
                        // isCorrect = true;
                        if(ingredient[i] == 2) {
                            stack.push(ingredient[i]);
                            booleanStack.push(true);
                        } else if(ingredient[i] == 1) {
                            stack.push(ingredient[i]);
                            booleanStack.push(true);
                            // isCorrect = true;
                        } else {
                            stack.push(ingredient[i]);
                            booleanStack.push(false);
                            // isCorrect = false;
                        }
                    } else if (stack.peek() == 2 && booleanStack.peek()) {
                        if(ingredient[i] == 3) {
                            stack.push(ingredient[i]);
                            booleanStack.push(true);
                        } else if(ingredient[i] == 1) {
                            stack.push(ingredient[i]);
                            booleanStack.push(true);
                        } else {
                            stack.push(ingredient[i]);
                            booleanStack.push(false);
                            // isCorrect = false;
                        }
                    } else if (stack.peek() == 3 && booleanStack.peek()) {
                        if(ingredient[i] == 1) {
                            stack.push(ingredient[i]);
                            booleanStack.push(true);
                            stack.pop();
                            stack.pop();
                            stack.pop();
                            stack.pop();
                            booleanStack.pop();
                            booleanStack.pop();
                            booleanStack.pop();
                            booleanStack.pop();
                            answer++;
                        } else {
                            stack.push(ingredient[i]);
                            booleanStack.push(false);
                        }
                    } else if (ingredient[i] == 1) {
                        stack.push(ingredient[i]);
                        booleanStack.push(true);
                    } else {
                        stack.push(ingredient[i]);
                        booleanStack.push(false);
                    }
                }
            }
        return answer;
    }
}