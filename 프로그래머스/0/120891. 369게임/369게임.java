class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderString = String.valueOf(order);
        String[] orderStringArr = orderString.split("");
        
        for(int i = 0; i < orderStringArr.length; i++) {
            if (orderStringArr[i].equals("3") || orderStringArr[i].equals("6") || orderStringArr[i].equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}