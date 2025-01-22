class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        String s = Integer.toString(k);
        
        for(int i = 0; i < str.length(); i++) {
            String sNum = Character.toString(str.charAt(i));
            if(sNum.equals(s)) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}