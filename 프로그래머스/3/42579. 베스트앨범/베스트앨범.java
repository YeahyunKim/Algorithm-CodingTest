import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> map = new HashMap<>();
        
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i < genres.length; i++) {    
            hashMap1.put(genres[i], hashMap1.getOrDefault(genres[i], 0) + plays[i]);
            HashMap<Integer, Integer> innerMap = map.getOrDefault(genres[i], new HashMap<>());
            innerMap.put(i, plays[i]);
            
            map.put(genres[i], innerMap);
        }
        
        ArrayList<String> arrayList = new ArrayList<>(hashMap1.keySet());
        
        Collections.sort(arrayList, (o1, o2) -> Integer.compare(hashMap1.get(o2), hashMap1.get(o1)));
        
        for(String s : arrayList) {
            ArrayList<Integer> rank = new ArrayList<>(map.get(s).keySet());
            
            Collections.sort(rank, (o1, o2) -> Integer.compare(map.get(s).get(o2), map.get(s).get(o1)));
            
            if(rank.size() >= 2) {
                answerList.add(rank.get(0));
                answerList.add(rank.get(1));
            } else {
                answerList.add(rank.get(0));
            }
        }
        
        int[] answer = new int[answerList.size()];
        
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}