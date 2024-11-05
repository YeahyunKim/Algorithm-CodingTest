import java.util.*;
class Solution {
    static boolean[][] graph;
    static boolean[] visited;

    public static void dfs(int n, int idx) {
        visited[idx] = true;
        
        for(int i = 1; i <= n; i++) {
            if(!visited[i] && graph[idx][i]) {
                 dfs(n, i);
            }   
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        graph = new boolean[n+1][n+1];
        visited = new boolean[n+1];
        
        for(int i = 0; i < computers.length; i++) {
            for(int j = 0; j < computers[i].length; j++) {
                if(i != j) {
                    if(computers[i][j] == 1){
                        // System.out.println(i + " / " + j);
                    
                        graph[i+1][j+1] = true;
                        graph[j+1][i+1] = true;

                    }
                }
                
            }
        }
        
        
        for(int i = 1; i <= n; i++) {
            if(!visited[i]) {
                dfs(n, i);
                answer++;
            }
        }
        
        return answer;
    }
}