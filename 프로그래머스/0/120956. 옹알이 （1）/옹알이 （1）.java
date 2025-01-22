class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < str.length; j++) {
             babbling[i] = babbling[i].replace(str[j], " ");   
            }
        }
        
        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll(" ", "");
            if(babbling[i].contains("")) {
                if(babbling[i].equals("")) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}