import java.util.*;
//다중집합 
class Solution {
    public int solution(String str1, String str2) {
        HashMap<String, Integer> hashMap1 = new HashMap<>(createFrequencyMap(str1));
        HashMap<String, Integer> hashMap2 = new HashMap<>(createFrequencyMap(str2));
        
        int unionCount = unionCount(hashMap2, hashMap1);
        int interSectionCount = interSectionCount(hashMap2, hashMap1);
        
        return unionCount == 0 ? 65536 : (int) ((interSectionCount / (double) unionCount) * 65536);
        
    }
    
    //2개 문자씩 나누어 넣어주기
    public static HashMap<String, Integer> createFrequencyMap(String str) {
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < str.length() - 1; i++) {
            String strPair = Character.toUpperCase(str.charAt(i)) + "" + Character.toUpperCase(str.charAt(i + 1));

            if (isValid(strPair)) {
                frequencyMap.put(strPair, frequencyMap.getOrDefault(strPair, 0) + 1);
            }
        }
        return frequencyMap;
    }
    
    //가능한 문자인지 판단 메서드
    public static boolean isValid(String str) {
        for(char c : str.toCharArray()) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
    
    //다중 합집합 메서드
    public static int unionCount(HashMap<String, Integer> hashMap2, HashMap<String, Integer> hashMap1) {
        int count = 0;
        HashMap<String, Integer> unionMap = new HashMap<>(hashMap1);
        
        for(Map.Entry<String, Integer> entry : hashMap2.entrySet()) {
            unionMap.put(entry.getKey(), Math.max(unionMap.getOrDefault(entry.getKey(), 0), entry.getValue()));
        }
        
        for(int value : unionMap.values()) {
            count += value;
        }
        return count;
    }
    
    
    //다중 교집합 메서드
    public static int interSectionCount(HashMap<String, Integer> hashMap2, HashMap<String, Integer> hashMap1) {
        int count = 0;
        
        HashMap<String, Integer> interSetcionMap = new HashMap<>(hashMap1);
        
        for(Map.Entry<String, Integer> entry : hashMap2.entrySet()) {
            interSetcionMap.put(entry.getKey(), Math.min(interSetcionMap.getOrDefault(entry.getKey(), 0), entry.getValue()));
        }
        
        for(Map.Entry<String, Integer> entry : interSetcionMap.entrySet()) {
            interSetcionMap.put(entry.getKey(), Math.min(hashMap2.getOrDefault(entry.getKey(), 0), entry.getValue()));
        }
        
        
        for(int value : interSetcionMap.values()) {
            count += value;
        }
        
        return count;
    }
}
