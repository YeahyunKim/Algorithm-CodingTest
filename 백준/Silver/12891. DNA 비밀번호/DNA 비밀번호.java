import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        input.nextLine();

        String str = input.nextLine();

        int[] array = new int[4];
        for(int i = 0; i < 4; i++) {
            array[i] = input.nextInt();
        }
        
        int[][] prefixArray = new int[N][4];
        
        for(int i = 0; i < N; i++) {
            if(i > 0) prefixArray[i][0] = prefixArray[i - 1][0];
            if(i > 0) prefixArray[i][1] = prefixArray[i - 1][1];
            if(i > 0) prefixArray[i][2] = prefixArray[i - 1][2];
            if(i > 0) prefixArray[i][3] = prefixArray[i - 1][3];
            
            if(str.charAt(i) == 'A') prefixArray[i][0]--;
            if(str.charAt(i) == 'C') prefixArray[i][1]--;
            if(str.charAt(i) == 'G') prefixArray[i][2]--;
            if(str.charAt(i) == 'T') prefixArray[i][3]--;
        }
        
        int count = 0;
        for(int i = 0; i < N - M + 1; i++) {
            int left = 0 + i;
            int right = M - 1 + i;
            int[] copyArray = Arrays.copyOf(array, 4);
            boolean flag = true;
            if(left > 0) {
                for(int j = 0; j < 4; j++) {
                    if(copyArray[j] + (prefixArray[right][j] - prefixArray[left-1][j]) > 0) {
                        flag = false;   
                        break;
                    }
                }
            } else {
                for(int j = 0; j < 4; j++) {
                    if(copyArray[j] + prefixArray[right][j] > 0) {
                        flag = false;   
                        break;
                    }
                }
            }
               
            if(flag) {
                count++;
            }     
        }
        
    System.out.print(count);
       
        
    }

}