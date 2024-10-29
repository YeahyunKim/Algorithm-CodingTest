class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int gcdA = getGCD(arrayA);
        int gcdB = getGCD(arrayB);
        boolean isArrayADevided = true;
        boolean isArrayBDevided = true;
        
        for(int i = 0; i < arrayA.length; i++) {
           if(gcdB == 1) break;
            
            if(arrayA[i] % gcdB == 0) {
                isArrayADevided = true;
                break;
            } else {
                isArrayADevided = false;
            }
            
        } 
        
        for(int i = 0; i < arrayB.length; i++) {
           if(gcdA == 1) break;
            
            if(arrayB[i] % gcdA == 0) {
                isArrayBDevided = true;
                break;
            } else {
                isArrayBDevided = false;
            }
        }
        if(isArrayBDevided && isArrayADevided) {
            answer = 0;
        } else {
            answer = Math.max(gcdA, gcdB);
        }
        return answer;
    }
    
    public static int gcd(int num1, int num2) {
        if(num1 % num2 == 0) {
            return num2;
        }
        return gcd(num2, num1 % num2);
    }
    
    public static int getGCD(int[] array) {
        int result = array[0];
        
        for(int i = 1; i < array.length; i++) {
            result = gcd(result, array[i]);
        }
        return result;
    }
}