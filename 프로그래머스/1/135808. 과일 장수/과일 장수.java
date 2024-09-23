import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        int[] sortedScore = Arrays.stream(score)
                            .boxed()
                            .sorted(Collections.reverseOrder())
                            .mapToInt(Integer::intValue)
                            .toArray();
        
        int[][] fruitBox = new int[score.length / m][m];
        

        for(int i = 0; i < score.length / m; i++) {
            for(int j = 0; j < m; j++) {
                fruitBox[i][j] = sortedScore[m*i+j];
            }
        }
    

        for(int i = 0; i < score.length / m; i++) {
            int min = fruitBox[i][0];
            for(int j = 0; j < m; j++) {
                if(min > fruitBox[i][j]) {
                    min = fruitBox[i][j];
                }
                
            }
            answer += min * m;
        }
        

        return answer;      
    }
}

// 최고 점수의 과일이 m개 이상 있는지 확인
// 없으면, 그다음 점수의 사과가 몇개 있는지 확인
