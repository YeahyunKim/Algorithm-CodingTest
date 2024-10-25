import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        ArrayList<String> arrayList = new ArrayList<>();
        
        for(int number : numbers) {
            arrayList.add(number + "");
        }
        
        Collections.sort(arrayList, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        if(arrayList.get(0).equals("0")) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(String s : arrayList) {
            sb.append(s);
        }
        
        
        return sb.toString();
    }
}