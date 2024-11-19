import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> rankMap = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> hashMap = new HashMap<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i < plays.length; i++) {
            rankMap.put(genres[i], rankMap.getOrDefault(genres[i], 0) + plays[i]);
            HashMap<Integer, Integer> innerMap = hashMap.getOrDefault(genres[i], new HashMap<>());
            innerMap.put(i, plays[i]);
            
            hashMap.put(genres[i], innerMap);
        }
        
        ArrayList<String> arrayList = new ArrayList<>(hashMap.keySet());
        
        Collections.sort(arrayList, (o1, o2) -> Integer.compare(rankMap.get(o2), rankMap.get(o1)));
        
        for(String s : arrayList) {
            ArrayList<Integer> rank = new ArrayList<>(hashMap.get(s).keySet());
            Collections.sort(rank, (o1, o2) -> Integer.compare(hashMap.get(s).get(o2), hashMap.get(s).get(o1)));
            
            // System.out.println(rank);
            
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