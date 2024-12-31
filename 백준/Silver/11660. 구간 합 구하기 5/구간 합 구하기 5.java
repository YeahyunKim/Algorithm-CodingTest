import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int M = input.nextInt();

        int[][] map = new int[N+1][N+1];

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                    map[i][j] = map[i-1][j] + map[i][j-1] - map[i-1][j-1] + input.nextInt();
            }
        }
        
        int answer = 0;
        for(int i = 0; i < M; i++) {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            
            answer = map[x2][y2] - map[x1-1][y2] - map[x2][y1-1] + map[x1-1][y1-1];
            System.out.println(answer);
        }

    }
}