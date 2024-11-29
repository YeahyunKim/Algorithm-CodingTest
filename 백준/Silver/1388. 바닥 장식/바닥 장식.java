import java.util.*;

public class Main {
    static int H,W;
    static String[][] map;
    static int[] dirY = {1};
    static int[] dirX = {1};

    public static void dfs(int y, int x, String s) {
        map[y][x] = "#";

        int newY = y + dirY[0];
        int newX = x + dirX[0];
        if(newY >= 0 && newX >= 0 && newX < W) {
            if (s.equals("-")) {
                if (map[y][newX].equals("-")) {
                    dfs(y, newX, map[y][newX]);
                }
            }
        }
        if(newY >= 0 && newX >= 0 && newY < H) {
            if(s.equals("|")) {
                if(map[newY][x].equals("|")) {
                    dfs(newY, x, map[newY][x]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        H = input.nextInt();
        W = input.nextInt();
        input.nextLine();
        int count = 0;

        map = new String[H][W];

        for(int i = 0; i < H; i++) {
            String[] letters = input.nextLine().split("");

            for(int j = 0; j < letters.length; j++) {
                map[i][j] = letters[j];
            }
        }

        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if(!map[i][j].equals("#")) {
                    dfs(i, j, map[i][j]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}