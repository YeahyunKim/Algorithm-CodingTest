import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        int N = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < N; i++) {
            hashSet.add(input.nextLine());
        }
        
        ArrayList<String> strArray = new ArrayList<>(hashSet);
        
        Collections.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int s1 = o1.length();
                int s2 = o2.length();
                if(s1 > s2) {
                    return 1;
                } else if(s1 < s2) {
                    return -1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        
        for(int i = 0; i < strArray.size(); i++) {
            System.out.println(strArray.get(i));   
        }
    }   
}