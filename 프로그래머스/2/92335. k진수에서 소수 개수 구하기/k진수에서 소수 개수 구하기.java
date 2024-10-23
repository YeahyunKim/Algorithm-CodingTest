class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder result = new StringBuilder();
        String text = "";
        
        while(n > 0) {
            int left = n % k;
            result.insert(0, left);
            n /= k;
        }
        String numberStr = result.toString();
        
        for(int i = 0; i < numberStr.length(); i++) {
            if(numberStr.charAt(i) != '0') {
                text += numberStr.charAt(i);
            } else {
                if (!text.equals("") && isPrime(text)) {
                    answer++;
                } 
                text = "";
            }

        }
        
        if (!text.equals("") && isPrime(text)) {
            answer++;
        } 
        return answer;
    }
    
    public static boolean isPrime(String strNum) {
        long num = Long.parseLong(strNum);
        if(num <= 1) return false;
        
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

