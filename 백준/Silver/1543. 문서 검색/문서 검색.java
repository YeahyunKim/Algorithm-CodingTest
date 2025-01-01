import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        String searchWord = input.nextLine();

        int answer = 0;
        while(str.contains(searchWord)) {
            str = str.replaceFirst(searchWord, "_");
            answer++;
        }

        System.out.println(answer);
    }
}
