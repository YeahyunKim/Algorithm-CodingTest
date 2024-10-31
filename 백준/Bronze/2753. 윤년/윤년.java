import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
		if(N%4==0) {
			if(N%400==0) System.out.println("1");
			else if(N%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
    }
}