import java.util.*;

public class Main {
    static int[][] map;
    static HashSet<String> hashSet = new HashSet<>();
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};

    public static void dfs(int y, int x, String str, int length) {
        if(length == 6) {
            hashSet.add(str);
            return;
        }

        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if (newY >= 0 && newX >=0 && newX < 5 && newY < 5) {
                dfs(newY, newX, str + map[newY][newX], length+1);
            }
        }

    }


    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        map = new int[5][5];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                int x = input.nextInt();

                map[i][j] = x;
            }
        }

        String numStr = "";
        int count = 1;

        for(int y = 0; y < 5; y++) {
            for(int x = 0; x < 5; x++) {
                dfs(y, x, Integer.toString(map[y][x]), count);
            }
        }

        System.out.println(hashSet.size());

    }
} 