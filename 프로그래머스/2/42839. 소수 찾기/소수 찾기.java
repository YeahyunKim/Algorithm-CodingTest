import java.util.*;

class Solution {
    static boolean[] visited;
    static ArrayList<Integer> arrayList;
    
    public int solution(String numbers) {
        int answer = 0;    
        arrayList = new ArrayList<>();
        
        String[] numberList = numbers.split("");
        
        String number = "";
        
        visited = new boolean[numberList.length];
        
        dfs(number, numberList);
        
        return arrayList.size();
    }
    
    public static void dfs(String numberStr, String[] numberList) {
        // "1"
        // [1, 7]
        for(int i = 0; i < numberList.length; i++) {
           if(visited[i]) {
                continue;
            }

            if(isDemical(numberStr + numberList[i]) && !arrayList.contains(Integer.parseInt(numberStr + numberList[i]))) {
                arrayList.add(Integer.parseInt(numberStr + numberList[i]));
            }

            visited[i] = true;

            dfs(numberStr + numberList[i], numberList);

            visited[i] = false;
        }
    }
    
    
    
    public static boolean isDemical(String s) {
        int number = Integer.parseInt(s);
        
        if(number < 2) return false;
        
        for(int i = 2; i <= (int) Math.sqrt(number); i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}