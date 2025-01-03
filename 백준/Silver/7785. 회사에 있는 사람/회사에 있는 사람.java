import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        int N = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < N; i++) {
            String[] s = input.nextLine().split(" ");
            
            if(s[1].equals("enter")) {
                hashMap.put(s[0], hashMap.getOrDefault(s[0], 0) + 1);
            } else {
                hashMap.remove(s[0]);
            }
        }
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        
        for(String s : hashMap.keySet()) {
            arrayList.add(s);
        }
        
        Collections.sort(arrayList, Collections.reverseOrder());
        
        for(String s : arrayList) {
            System.out.println(s);
        }
        
    }
}