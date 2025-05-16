package org.DFS.바이러스2606;

import java.io.*;
import java.util.Arrays;
import java.util.*;

public class 바이러스 {
    static boolean[][] graph;
    static boolean[] visited;
    static int N,M;
    static int answer;

    public static void dfs(int idx) {
        visited[idx] = true;
        answer++;

        for(int i = 1; i <= N; i++) {
            if(!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //0. 입력 및 출력 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];

        //1. graph에 연결 정보 채우기
        int x, y;
        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
            graph[y][x] = true;
        }

        for(int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(graph[i]));
        }

        //2. 재귀함수 호출
        dfs(1);

        //3. 출력
        bw.write(answer - 1);

        br.close();
        bw.close();
    }
}
