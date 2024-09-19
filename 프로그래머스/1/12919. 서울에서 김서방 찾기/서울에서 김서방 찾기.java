class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int index = 0;
        

        for(String s : seoul) {
            if(s.equals("Kim")) {
                break;
            } else {
                index++;
                continue;
            }
        }
        
        answer = "김서방은 " + index + "에 있다";

        return answer;
        
        //서울에서 김서방을 왜찾아;????????????
        
    }
}