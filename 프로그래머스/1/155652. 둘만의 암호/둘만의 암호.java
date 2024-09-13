class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        // 문자열 s의 각 문자를 순회하며 변형
        for (char c : s.toCharArray()) {
            sb.append(shiftCharacter(c, index, skip));
        }
        
        return sb.toString();
    }
    
    static char shiftCharacter(char c, int index, String skip) {
        int count = 0;
        
        // 지정된 횟수만큼 문자를 변형
        while (count < index) {
            c++;
            
            // 'z'를 넘어가면 다시 'a'로 순환
            if (c > 'z') {
                c = 'a';
            }
            
            // 현재 문자가 건너뛸 문자에 포함되지 않는 경우만 count 증가
            if (!skip.contains(String.valueOf(c))) {
                count++;
            }
        }
        
        return c;
    }
}