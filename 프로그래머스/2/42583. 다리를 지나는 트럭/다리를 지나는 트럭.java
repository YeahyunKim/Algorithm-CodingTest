import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        //걸리는 시간 공식 = bridge_length + 건너고 있는 truck count
        
        //트럭 1대가 건너는데 걸리는 시간 공식  = bridge_length + 1
        
        //만약 한번에 건너지 못하고, 나누어 진다면, 나누어진 count 만큼 빼주기
        
        int index = 0;
        int totalWeight = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < bridge_length; i++) {
            queue.add(0);
        }    
    
        while(!queue.isEmpty()) {
            totalWeight -= queue.poll();
            answer++;
            
            if (index == truck_weights.length){
                continue;
            }
            
            if(weight >= totalWeight + truck_weights[index]) {
                queue.add(truck_weights[index]);
                totalWeight += truck_weights[index];
                index++;
            } else {
                queue.add(0);
            }
        }
        
        
   
        return answer;
    }
}

