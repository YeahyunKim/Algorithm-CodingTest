import java.util.*;

public class Main {
    static int W, H;
    static String[][] map;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};
    static int wolfCount = 0;
    static int sheepCount = 0;
    static int answerWolfCount = 0;
    static int answerSheepCount = 0;

    public static void dfs(int y, int x, String s) {
        if(s.equals("v")) {
            wolfCount++;
        }
        if(s.equals("k")) {
            sheepCount++;
        }

        map[y][x] = "#";

        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if(newY >= 0 && newX >= 0 && newY < H && newX < W) {
                if (!map[newY][newX].equals("#")) {
                    dfs(newY, newX, map[newY][newX]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        H = input.nextInt();
        W = input.nextInt();
        input.nextLine();

        map = new String[H][W];

        for(int h = 0; h < H; h++) {
            String[] letters = input.nextLine().split("");
            for(int w = 0; w < letters.length; w++) {
                map[h][w] = letters[w];
            }
        }

        for(int h = 0; h < H; h++) {
            for(int w = 0; w < W; w++) {
                if(!map[h][w].equals("#")) {
                    dfs(h, w, map[h][w]);
                    if(sheepCount > wolfCount) {
                        wolfCount = 0;
                    } else {
                        sheepCount = 0;
                    }
                    answerWolfCount += wolfCount;
                    answerSheepCount += sheepCount;

                    wolfCount = 0;
                    sheepCount = 0;
                }
            }
        }

        System.out.println(answerSheepCount + " " + answerWolfCount);

    }
}