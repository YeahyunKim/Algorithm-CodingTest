import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        String[][] s = new String[N][2];
        input.nextLine();
        
        for(int i = 0; i < N; i++) {
            String[] inputStr = input.nextLine().split(" ");
            s[i][0] = inputStr[0];
            s[i][1] = inputStr[1];
        }
        
        Arrays.sort(s, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
            
        });
        
        for(int i = 0; i < N; i++) {
            System.out.println(s[i][0] + " " + s[i][1]);
        }
            
            
        
        
    }
}