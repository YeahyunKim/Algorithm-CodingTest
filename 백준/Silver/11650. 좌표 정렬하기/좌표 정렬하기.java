import java.util.*;

public class Main {
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

        Arrays.sort(graph, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2) {
                if(o1[0] - o2[0] > 0) {
                    return 1;
                } else if(o1[0] - o2[0] < 0) {
                    return -1;
                } else {
                    return o1[1] - o2[1];
                }
            }
        });
        for(int i = 0; i < N; i++) {
            System.out.println(graph[i][0] + " " + graph[i][1]);
        }

    }
}