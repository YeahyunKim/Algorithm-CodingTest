import java.util.*;
//다중집합 
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        
        HashMap<String, Integer> hashMap3 = new HashMap<>();
        int count1 = 0;
        int count2 = 0;
        
        
        for(int i = 0; i < str1.length() - 1; i++) {
            
            String str = Character.toUpperCase(str1.charAt(i)) + "" + Character.toUpperCase(str1.charAt(i+1));
            
            if(isValid(str)) {
                hashMap1.put(str, hashMap1.getOrDefault(str, 0) + 1);    
            }
            
        }
        
        for(int i = 0; i < str2.length() - 1; i++) {
            
            String str = Character.toUpperCase(str2.charAt(i)) + "" + Character.toUpperCase(str2.charAt(i+1));
            
            if(isValid(str)) {
                hashMap2.put(str, hashMap2.getOrDefault(str, 0) + 1);    
            }
            
        }
        
        for(Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
            hashMap3.put(entry.getKey(), entry.getValue());
        }
        
        for(Map.Entry<String, Integer> entry : hashMap2.entrySet()) {
            hashMap3.put(entry.getKey(), Math.max(hashMap3.getOrDefault(entry.getKey(), 0), entry.getValue()));
        }
        
        
        //합집합 개수 구하기
        for(int value : hashMap3.values()) {
            count2 += value;
        }
        
        hashMap3.clear();
        
        for(Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
            hashMap3.put(entry.getKey(), entry.getValue());
        }
        // System.out.println(hashMap2);
        // System.out.println(hashMap3);
        
        for(Map.Entry<String, Integer> entry : hashMap2.entrySet()) {
            hashMap3.put(entry.getKey(), Math.min(hashMap3.getOrDefault(entry.getKey(), 0), entry.getValue()));
        }
        
                
        for(Map.Entry<String, Integer> entry : hashMap3.entrySet()) {
            hashMap3.put(entry.getKey(), Math.min(hashMap2.getOrDefault(entry.getKey(), 0), entry.getValue()));
        }
        
        // System.out.println("교집합 구한 후 = " + hashMap3);
        
        for(int value : hashMap3.values()) {
            count1 += value;
        }
        
        if (count1 == 0 && count2 == 0) {
            return 65536;
        } else {
            return (int) (((double) count1 / count2) * 65536);
        }

        
        
        // return (int) (((double) count1 / count2) * 65536) == 0 ? 65536 : (int) (((double) count1 / count2) * 65536);
    }
    
    public static boolean isValid(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            } 
        }
        return true;
    }
}
