import java.util.*;

public class Main {
    static int W, H;
    static int[][] map;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};
    static int count = 1;

    public static void dfs(int y, int x, int n) {
        map[y][x] = 3;

        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if(newY >= 0 && newX >=0 && newY < H && newX < W && map[newY][newX] == n) {
                count++;
                dfs(newY, newX, n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        W = input.nextInt();
        H = input.nextInt();

        int teamScore = 0;
        int enemyScore = 0;

        input.nextLine();

        map = new int[H][W];

        for(int i = 0; i < H; i++) {
            String[] str = input.nextLine().split("");

            for(int j = 0; j < str.length; j++) {
                if(str[j].equals("W")) {
                    map[i][j] = 1;
                }
            }

        }
        
        for(int i = 0; i < H; i++) {
            int num = 1;
            for(int j = 0; j < W; j++) {
                if(map[i][j] == num) {
                    dfs(i, j, num);
                    teamScore += (count * count);
                    count = 1;
                }
            }

        }
        
        for(int i = 0; i < H; i++) {
            int num = 0;
            for(int j = 0; j < W; j++) {
                if(map[i][j] == num) {
                    dfs(i, j, num);
                    enemyScore += count * count;
                    count = 1;
                }
            }
        }

        System.out.println(teamScore + " " + enemyScore);
    }
}