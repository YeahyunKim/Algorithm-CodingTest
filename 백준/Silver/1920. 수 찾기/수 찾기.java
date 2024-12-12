import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = input.nextInt();
        int[] list = new int[N];
        
        
        for(int i = 0; i < N; i++) {
            list[i] = input.nextInt();
        }
        
        Arrays.sort(list);
        
        int M = input.nextInt();
        
        for(int i = 0; i < M; i++) {
            if(binarySearch(list, input.nextInt()) >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        
        System.out.println(sb);
    }
    
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end) {
            int mid = (end + start)/2; //2
            
            if(key < arr[mid]) {
                end = mid - 1;
            } else if(key > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}