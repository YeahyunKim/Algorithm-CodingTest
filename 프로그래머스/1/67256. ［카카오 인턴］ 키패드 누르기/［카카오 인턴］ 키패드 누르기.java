import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left =10; // 초기 왼쪽 손가락
        int right =12; // 초기 오른쪽 손가락 
        
        for(int tmp: numbers){
            if(tmp==1||tmp==4||tmp==7){
                answer+="L";
                left = tmp; // 현재 손가락 위치를 옮김
            }else if(tmp==3||tmp==6||tmp==9){
                answer+="R";
                right = tmp; // 현재 손가락 위치를 옮김
            }else { // 2 5 8 0 일 때 
                if(tmp==0) tmp=11;
                int leftdist = Math.abs(tmp-left)/3+Math.abs(tmp-left)%3;
                int rightdist = Math.abs(tmp-right)/3+Math.abs(tmp-right)%3;
                
                if(leftdist<rightdist){
                    answer+="L";
                    left = tmp;
                }else if(leftdist>rightdist){
                    answer+="R";
                    right = tmp;
                }else{
                    if(hand.equals("left")){
                        answer+="L";
                        left = tmp;
                    }else{
                        answer+="R";
                        right = tmp;
                    }
                }
            }
        }
        return answer;
    }
}