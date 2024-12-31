import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] graph = new int[N][2];
        
        for(int i = 0; i < N; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            graph[i][0] = x;
            graph[i][1] = y;
        }
        
        for(int i = 0; i < N; i++) {
            int rank = 1;
            for(int j = 0; j < N; j++) {
                if(i==j) continue;
                if(graph[i][0] < graph[j][0] && graph[i][1] < graph[j][1]) {
                    rank++;
                }
            }
                System.out.print(rank + " ");

        }
    }
}