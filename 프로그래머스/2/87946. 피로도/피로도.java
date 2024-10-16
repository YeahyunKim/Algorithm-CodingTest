import java.util.*;
class Solution {
    public int answer; // 최대 던전 수
    public boolean[] visited; // 방문 여부
    
    public int solution(int k, int[][] dungeons) {
        //방문 배열을 만들기
        visited = new boolean[dungeons.length];
        //처음 뎁스는 0으로 시작함
        //처음에는 피로도를 소모하지 않았기 때문에 k 그대로 보내주기
        dfs(0, k, dungeons);
        

        return answer;
    }
    
        public void dfs(int depth, int remain, int[][] dungeons) {
        for(int i = 0; i < dungeons.length; i++) {
            //방문을 안했으면, 현재 방문한 던전을 true로 처리
            if (visited[i] || remain - dungeons[i][0] < 0) {
                continue;
            }
            visited[i] = true;
            
            //던전을 돌았기 때문에, 소모된 피로도를 빼주기 위해 해당 던전 피로도 소모도 저장
            int cost = dungeons[i][1];
            
            //다음 방문을 하기 위해, depth를 1 추가하고, 남은 피로도를 보내주기
            dfs(depth + 1, remain-cost, dungeons);
            
            // 다시 방문 해제
            visited[i] = false;
        }
        
        answer = Math.max(answer, depth);
    }

}
