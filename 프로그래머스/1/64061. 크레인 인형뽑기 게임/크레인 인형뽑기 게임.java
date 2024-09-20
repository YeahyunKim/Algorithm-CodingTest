import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> basket = new Stack<>();

        for (int move : moves) {
            for(int i = 0; i < board.length; i++) {
                int kakaoFriend = board[i][move - 1]; //인형
                board[i][move - 1] = 0; //인형 뽑으면 해당 위치 0으로 바꾸기
                
                if(kakaoFriend != 0) {
                    if(basket.empty()) {
                        basket.push(kakaoFriend); 
                    } else if(kakaoFriend != basket.peek()) {
                        basket.push(kakaoFriend);  
                    } else { 
                        basket.pop(); answer += 2; //두개 터지니까?
                    }
                    break;
                }
            }
        }
        return answer;
    }
}