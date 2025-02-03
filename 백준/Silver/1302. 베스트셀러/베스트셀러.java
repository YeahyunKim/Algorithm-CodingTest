import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        input.nextLine();
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        
        for(int i = 0; i < a; i++) {
            String s = input.nextLine();
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