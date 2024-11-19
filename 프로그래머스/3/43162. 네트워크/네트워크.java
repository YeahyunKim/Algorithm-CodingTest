import java.util.*;
class Solution {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int answer = 0;
    
    public static void dfs(int cpu, int idx) {
        visited[idx] = true;
        
        for(int i = 0; i < graph[idx].size(); i++) {
            if(!visited[graph[idx].get(i)]) {
                dfs(cpu, graph[idx].get(i));
                
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        
        graph = new ArrayList[computers.length + 1];
        visited = new boolean[computers.length + 1];
        
        for(int i = 1; i <= computers.length; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < computers.length; i++) {
            for(int j = 0; j < computers[i].length; j++) {
                if(i != j) {
                    if(computers[i][j] == 1 && !graph[i+1].contains(j+1)) {
                        graph[i+1].add(j+1);
                        graph[j+1].add(i+1);
                    }    
                }
                
            }
        }
        
        
        // System.out.println(Arrays.toString(visited));
        
        for(int i = 1; i <= n; i++) {
            if(!visited[i]) {
                dfs(n, i);
                answer++;
            }
        }
        return answer;

    }
}