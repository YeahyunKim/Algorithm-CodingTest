import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();

        String[] s = input.nextLine().split("");
        String[][] map = new String[N][N];

        for(int i = 0; i < N; i++) {
            Arrays.fill(map[i], ".");
        }

        int x = 0;
        int y = 0;
        for(int i = 0; i < s.length; i++) {
            int newX = x;
            int newY = y;
            String now = s[i];

            if(now.equals("D")) newY += 1;
            else if(now.equals("U")) newY -= 1;
            else if(now.equals("R")) newX += 1;
            else if(now.equals("L")) newX -= 1;

            if(newY < 0 || newY >= N || newX < 0 || newX >= N) continue;

            changeMap(map, y, x, newY, newX, now);
            x = newX;
            y = newY;
        }


        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(map[i][j]);
            }
            if(i != N-1) {
                System.out.println();
            }
        }
    }

    public static String[][] changeMap(String[][] array, int y1, int x1, int y2, int x2, String direction) {
        if(direction.equals("D") || direction.equals("U")) {
            if(array[y1][x1].equals(".")) array[y1][x1] = "|";
            else if(array[y1][x1].equals("-")) array[y1][x1] = "+";

            if(array[y2][x2].equals(".")) array[y2][x2] = "|";
            else if(array[y2][x2].equals("-")) array[y2][x2] = "+";

        }

        if(direction.equals("R") || direction.equals("L")) {
            if(array[y1][x1].equals(".")) array[y1][x1] = "-";
            else if(array[y1][x1].equals("|")) array[y1][x1] = "+";

            if(array[y2][x2].equals(".")) array[y2][x2] = "-";
            else if(array[y2][x2].equals("|")) array[y2][x2] = "+";
        }

        return array;
    }
}
