import java.util.*;

public class Main {
    static boolean isCircle;
    static int H, W;
    static int startY, startX;
    static String[][] map;
    static boolean[][] visited;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};

    public static void dfs(int y, int x, String color, int count) {
        visited[y][x] = true;

        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if(newY >= 0 && newX >= 0 && newY < H && newX < W) {
                if(map[newY][newX].equals(color) && !visited[newY][newX]) {
                    dfs(newY, newX, color, count+1);
                } else {
                    if(count >= 4 && newY == startY && newX == startX) {
                        isCircle = true;
                        return;
                    }
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


        for(int i = 0; i < H; i++) {
            String[] strList = input.nextLine().split("");
            for(int j = 0; j < strList.length; j++) {
                map[i][j] = strList[j];
            }
        }

        for(int h = 0; h < H; h++) {
            for(int w = 0; w < W; w++) {
                visited = new boolean[H][W];
                isCircle = false;
                startY = h;
                startX = w;
                dfs(h, w, map[h][w], 1);

                if(isCircle) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        if(!isCircle) {
            System.out.println("No");
        }
    }
}