import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[] arrayA = new int[N + 1];
        int[] arrayB = new int[N + 1];

        String line = br.readLine();
        char[] wordsList = line.toCharArray();

        for (int i = 0; i < N + 1; i++) {
            if (i == 0) {
                arrayA[i] = 0;
                arrayB[i] = 0;
                continue;
            }

            if (wordsList[i - 1] == 'W') {
                if (i == 1) {
                    arrayA[i] = 1;
                } else {
                    arrayA[i] = arrayA[i - 1] + 1;
                    arrayB[i] = arrayB[i - 1];
                }
            } else {
                if (i == 1) {
                    arrayB[i] = 1;
                } else {
                    arrayB[i] = arrayB[i - 1] + 1;
                    arrayA[i] = arrayA[i - 1];
                }
            }
        }

        int p1 = 1;
        int p2 = 2;
        int answer = 0;

        if (N == 1) {
            p2 = 1;
            int Wcount = arrayA[p2] - arrayA[p1 - 1];
            int Bcount = arrayB[p2] - arrayB[p1 - 1];
            if (Wcount >= W && Bcount <= B) {
                answer = 1;
            }
        } else {
            while (p1 <= N && p2 <= N) {
                int distance = p2 - p1 + 1;
                int Wcount = arrayA[p2] - arrayA[p1 - 1];
                int Bcount = arrayB[p2] - arrayB[p1 - 1];

                if (Wcount >= W && Bcount <= B) {
                    answer = Math.max(answer, distance);
                    p2++;
                    continue;
                }

                if (Wcount < W) {
                    p2++;
                }

                if (Bcount > B) {
                    p1++;
                }
            }
        }

        System.out.println(answer);
    }
}
