class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] list = {"a", "e", "i", "o", "u"};
        
        for(int i = 0; i < list.length; i++) {
                my_string = my_string.replace(list[i], "");
        }
        
        return my_string;
    }
}