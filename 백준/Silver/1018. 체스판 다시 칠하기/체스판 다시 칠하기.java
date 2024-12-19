import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int M = input.nextInt();
        input.nextLine();
        
        String[] arr = new String[N];
        
        String[] Wboard = new String[8];
        String[] Bboard = new String[8];
        
       for(int i = 0; i < N; i++) {
           arr[i] = input.nextLine();
       }
        
       for(int i = 0; i < 8; i++) {
           if(i % 2 == 0) {
               Wboard[i] = "WBWBWBWB";
           } else {
               Wboard[i] = "BWBWBWBW";
           }
       }
        
        for(int i = 0; i < 8; i++) {
           if(i % 2 == 0) {
               Bboard[i] = "BWBWBWBW";
           } else {
               Bboard[i] = "WBWBWBWB";
           }
       }
        
       int min = 64;
        
        for(int i = 0; i < N-7; i++) {
            for(int j = 0; j < M-7; j++) {
                int count1 = 0;
                int count2 = 0;
                
                for(int k = 0; k < 8; k++) {
                    for(int l = 0; l < 8; l++) {
                        if(Wboard[k].charAt(l) != arr[k + i].charAt(l + j)) count1++;
                        if(Bboard[k].charAt(l) != arr[k + i].charAt(l + j)) count2++;
                    }
                }
                min = Math.min(min, Math.min(count1, count2));
            }
        }
        System.out.println(min);
    }
}