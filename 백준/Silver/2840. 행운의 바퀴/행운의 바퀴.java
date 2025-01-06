import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); //칸의 수
        int M = input.nextInt(); //돌리는 횟수
        input.nextLine();

        String[] plateList = new String[N];
        Arrays.fill(plateList, "?");

        boolean flag = true;
        int lastCallIndex = 0;

        int index = 0;

        for(int i = 0; i < M; i++) {
            String[] sList = input.nextLine().split(" ");

            int a = Integer.parseInt(sList[0]);
            String s = sList[1];

            index += a;


            if (plateList[index % N].equals("?")) {
                if(!isContain(plateList, s)) {
                    plateList[index % N] = s;
                } else {
                    flag = false;
                    break;
                }
            }
            else if (!plateList[index % N].equals(s)) {
                flag = false;
                break;
            }
        }

        int count = 0;

        if(!flag) {
            System.out.println("!");
        } else {
            while(count < N) {
                System.out.print(plateList[index % N]);
                index--;
                count++;
            }
        }
    }

    public static boolean isContain(String[] array, String s) {
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(s)) {
                return true;
            }
        }
        return false;
    }
}
