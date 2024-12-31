
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> test = new LinkedList<>();

        int N = input.nextInt();
        input.nextLine();
        for(int i = 0; i < N; i++) {
            String[] s = input.nextLine().split(" ");

            if(s.length > 1) {
                test.offer(Integer.parseInt(s[1]));
            } else {
                if(s[0].equals("front")) {
                    if(test.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(test.peek());
                    }
                } else if(s[0].equals("back")) {
                    if(test.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(test.peekLast());
                    }
                } else if(s[0].equals("size")) {
                    System.out.println(test.size());
                } else if(s[0].equals("empty")) {
                    if(test.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                } else if(s[0].equals("pop")) {
                    if(test.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(test.poll());
                    }
                }
            }
        }
    }
}