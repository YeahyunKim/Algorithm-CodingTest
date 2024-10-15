import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        if (cacheSize > 0) {
            for(int i = 0; i < cities.length; i += cacheSize) {
                for(int j = i; j < cacheSize + i; j++) {
                    // System.out.println(j);
                    if (j <= cities.length - 1) {
                        if (arrayList.size() < cacheSize) {
                            if(arrayList.size() == 0) {
                                //제일 최초에 값 넣어주기
                                arrayList.add(cities[j].toLowerCase());
                                answer += 5;   
                            } else {
                                if(arrayList.contains(cities[j].toLowerCase())) {
                                    int index = arrayList.indexOf(cities[j].toLowerCase());
                                    arrayList.remove(index);
                                    arrayList.add(cities[j].toLowerCase());
                                    answer += 1;
                                } else {
                                    arrayList.add(cities[j].toLowerCase());
                                    answer += 5;   
                                }
                            }
                        } else {
                            if(arrayList.contains(cities[j].toLowerCase())) {
                                int index = arrayList.indexOf(cities[j].toLowerCase());
                                // System.out.println(index + ", " + cities[j] + ", i = " + j);
                                arrayList.remove(index);
                                arrayList.add(cities[j].toLowerCase());
                                answer += 1;
                            } else {
                                arrayList.add(cities[j].toLowerCase());
                                arrayList.remove(0); 
                                answer += 5;
                            } 
                        }                       
                    }
                }
                // System.out.println("finish i = " + i);
            }      
        } else {
            answer = cities.length * 5;
        }      

        return answer;
    }
}