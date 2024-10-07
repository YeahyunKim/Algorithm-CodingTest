import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] temp = new String[picture.length];
        Arrays.fill(temp, "");
        for(int i = 0; i < picture.length; i++) {
            for(int j = 0; j < picture[i].length(); j++) {
                for(int n = 0; n < k; n++) {
                    // System.out.println(picture[i].charAt(j));
                    temp[i] += picture[i].charAt(j);
                }
            }
        }
        
        String[] answer = new String[picture.length * k];
        
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < k; j++) {
                answer[i] = temp[i / k];
            }
        }

        return answer;
    }
}
// [
// "..xxxx......xxxx.."
// "xx....xx..xx....xx"
// "xx......xx......xx"
// "..xx..........xx.."
// "....xx......xx...."
// "......xx..xx......"
// "........xx........"
// ,"","","","","","",""]