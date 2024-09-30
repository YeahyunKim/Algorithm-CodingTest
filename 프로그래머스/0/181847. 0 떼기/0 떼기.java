class Solution {
    public String solution(String n_str) {
        String answer = "";
        int indexCount = 0;
        for(int i = 0; i < n_str.length(); i++) {
            if(n_str.charAt(i) == '0' && indexCount == 0) {
                
            } else {
                indexCount++;
                answer += n_str.charAt(i);
                
            }
        }
        return answer;
    }
}