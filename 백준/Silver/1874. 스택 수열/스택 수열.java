import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        int N = input.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i++) {
            queue.offer(input.nextInt());
        }

for (int i = 1; i <= N; i++) {
    stack.push(i);
    sb.append("+").append("\n");

    while (!stack.isEmpty() && !queue.isEmpty() && stack.peek().equals(queue.peek())) {
        stack.pop();
        queue.poll();
        sb.append("-").append("\n");
    }
}

if (!queue.isEmpty()) {
    System.out.println("NO");
} else {
    System.out.println(sb);
}

    }
}