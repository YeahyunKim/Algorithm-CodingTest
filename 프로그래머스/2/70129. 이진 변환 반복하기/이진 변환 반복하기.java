class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        int temp = 0;

        while(!s.equals("1")) {
            //전체 길이 구하기
            temp = s.length();
            //2
            //2
            
            //0 제거
            s = s.replaceAll("0", "");
            //없음
            //10 -> 1
            
            //전체길이에서 제거한 0의 개수 더하기
            answer[1] += temp - s.length();
            //1 = 2 - 1 //현재 3
            
            //제거된 s의 길이를 BianryString으로 바꾸기
            s = Integer.toBinaryString(s.length());
            //1을 바꾸면, 1
            
            //변환결과 개수 1더하기  //현재 3
            answer[0]++;   
        }
        return answer;
    }
}

