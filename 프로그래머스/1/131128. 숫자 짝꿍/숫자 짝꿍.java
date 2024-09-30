import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        char[] arrX = X.toCharArray();
        char[] arrY = Y.toCharArray();
        int xIndex = X.length() -1;
        int yIndex = Y.length() -1;
        
        Arrays.sort(arrX);
        Arrays.sort(arrY);
        
        while(xIndex >= 0 && yIndex >= 0) {
            if(arrX[xIndex] == arrY[yIndex]) {
                answer.append(arrX[xIndex]); 
                
                xIndex--;
                yIndex--;
                
            } else if(arrX[xIndex] > arrY[yIndex]) {
                xIndex--;
            } else {
                yIndex--;
            }
        }
        
        if(answer.length() == 0) {
            return "-1";
        }
        if(answer.toString().matches("0+")) {
            return "0";
        }

        return answer.toString();

    }
}