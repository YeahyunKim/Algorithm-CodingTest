class Solution {
    public int solution(int[] num_list) {
        String oddStr = "";
        String evenStr = "";        
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 1) {
                oddStr += Integer.toString(num_list[i]);
            } else {
                evenStr += Integer.toString(num_list[i]);
            }
        }
        
        return Integer.parseInt(oddStr) + Integer.parseInt(evenStr);
    }
}