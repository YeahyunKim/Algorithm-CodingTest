class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        int changeStr = 0;
        String binaryStr = "";
        int zeroCount = 0;
        int binaryCount = 0;
        String newStr = "";

        while(!s.equals("1")) {
            changeStr = s.length();
            if(s.contains("0")) {
                for(int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '0') {
                        zeroCount++;
                    } else {
                        newStr += s.charAt(i);
                    }
                }
                s = newStr;
                newStr = "";
            } else {
                while(changeStr > 0) {
                    if(changeStr % 2 == 1) {
                        binaryStr = "1" + binaryStr;
                    } else {
                        binaryStr += "0";
                    }
                    changeStr = changeStr / 2;
                }
                binaryCount++;
                s = binaryStr;
                binaryStr = "";
            }

        }
        answer[0] = binaryCount + 1;
        answer[1] = zeroCount;
        return answer;
    }
}

