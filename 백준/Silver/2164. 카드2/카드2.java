import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        
        int N = input.nextInt();
        for(int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        
        while(true) {
            if(queue.size() == 1) {
                break;
            }
            
            queue.poll();
            queue.offer(queue.poll());
        }
        System.out.println(queue.poll());
    }
}