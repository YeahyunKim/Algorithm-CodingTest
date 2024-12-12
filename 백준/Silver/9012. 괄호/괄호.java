import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();

        for(int i = 0; i < N; i++) {
            String[] list = input.nextLine().split("");
            Stack<String> stack = new Stack<>();

            for(int j = 0; j < list.length; j++) {
                String s = list[j];
                if(stack.isEmpty()) {
                    stack.add(s);
                    continue;
                }

                if(s.equals(")")) {
                    if(stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        stack.add(s);
                    }
                } else {
                    stack.add(s);
                }
            }
            System.out.println(stack.isEmpty() ? "YES" : "NO");
        }
    }
}