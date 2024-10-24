import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        // HashMap<Integer, Integer> uniqueNumMap = new HashMap<>();
        
        HashMap<String, HashMap<Integer, Integer>> map = new HashMap<>();
        
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i < genres.length; i++) {
            hashMap.put(genres[i], hashMap.getOrDefault(genres[i], 0) + plays[i]);
            // uniqueNumMap.put(i, uniqueNumMap.getOrDefault(i, plays[i]));
            
            //map.put(genres[i], map.getOrDefault(genres[i], new HashMap<Integer, Integer>()).put(i, plays[i]));
            HashMap<Integer, Integer> innerMap = map.getOrDefault(genres[i], new HashMap<Integer, Integer>());
            // HashMap<Integer, Integer> innerMap = new HashMap<>();
            innerMap.put(i, plays[i]);
            map.put(genres[i], innerMap);
        }
        
        
        // System.out.println("map = " + map);
        
        // System.out.println("장르별 총 점수 = " + hashMap);
        // System.out.println("고유번호별 점수 = " + uniqueNumMap);
        
        ArrayList<String> list = new ArrayList<>(hashMap.keySet());
        
        Collections.sort(list, (o1, o2) -> Integer.compare(hashMap.get(o2), hashMap.get(o1)));
        
        // System.out.println("장르별 랭킹 = " + list.toString());
        
        for(String s : list) {
            ArrayList<Integer> result = new ArrayList<>(map.get(s).keySet());
            
            Collections.sort(result, (o1, o2) -> Integer.compare(map.get(s).get(o2), map.get(s).get(o1)));
            
            
            if(result.size() >= 2) {
                answerList.add(result.get(0));
                answerList.add(result.get(1));
            } else {
                answerList.add(result.get(0));
            }
            
            
        }
        
        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}