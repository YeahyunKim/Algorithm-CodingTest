import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        
        int N = input.nextInt();
        
        for(int i = 0; i < N; i++) {
            String s = input.next();
            
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }
        
        String bookTitle = "";
        int maxValue = 0;
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if(maxValue < entry.getValue()) {
                maxValue = entry.getValue();
                bookTitle = entry.getKey();
                arrayList.clear();
                arrayList.add(bookTitle);
            }
            if(maxValue == entry.getValue()) {
                arrayList.add(bookTitle);
                arrayList.add(entry.getKey());
            }
        }
        
        if(arrayList.size() > 1) {
            Collections.sort(arrayList);
            System.out.println(arrayList.get(0));
        } else {
            System.out.println(arrayList.get(0));
        }
    }
}