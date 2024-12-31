class Solution {
    static boolean[] visited;
    static int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return answer;
    }
    
    public static void dfs(int depth, int remain, int[][] dungeons) {
        
        for(int i = 0; i < dungeons.length; i++) {

            if(visited[i] || remain - dungeons[i][0] < 0) {
                continue;
            }
            
            visited[i] = true;
            
            int cost = dungeons[i][1];
            
            dfs(depth+1, remain - cost, dungeons);
            
            visited[i] = false;
            
        }
        answer = Math.max(answer, depth);
    }
    

}