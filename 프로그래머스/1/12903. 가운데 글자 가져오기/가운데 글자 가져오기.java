class Solution {
    public String solution(String s) {
        String answer = "";
        //1.입력된 문자열의 길이가 홀수일 때
        if(s.length()%2!=0){
        	//현재 문자열에서 s.length()/2 부터 +1한 자리 직전까지 가져오기(결국 한글자)
             answer = s.substring(s.length()/2,s.length()/2+1);
        }
        //2.짝수일 때
        else{
        	//현재 문자열에서 s.length()/2-1 부터 +2한 자리 직전까지 가져오기(결국 두글자)
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }
            
        return answer;
    }
}