import java.util.*;

public class Main {
    static int[] list = new int[45];
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        for(int i = 1; i <= 45; i ++) {
            list[i - 1] = i * (i + 1) / 2;
        }
        
        for(int i = 0; i < N; i++) {
            int x = input.nextInt();
            
            System.out.println(isRactangle(x));
            
        }
    }
    
    public static int isRactangle(int a) {
        for(int i = 0; i < 45; i++) {
            for(int j = 0; j < 45; j++) {
                
                for(int k = 0; k < 45; k++) {
                    
                    if(list[i] + list[j] + list[k] == a) return 1;
                }
            }
        }
        
        return 0;
    }
}