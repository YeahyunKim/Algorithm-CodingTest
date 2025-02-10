import java.util.*;

public class Main {
    static int H, W, C;
    static boolean[][] map;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, 1, -1};

    static int count = 1;

    public static void dfs(int y, int x) {
        map[y][x] = true;
        
        for(int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if(newY >= 0 && newX >= 0 && newY < H && newX < W && !map[newY][newX]) {
                count++;
                dfs(newY, newX);
            }
        }

        
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        H = input.nextInt();
        W = input.nextInt();
        C = input.nextInt();

        map = new boolean[H][W];

        for(int i = 0; i < C; i++){
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();

            for(int y = y1; y < y2; y++) {
                for(int x = x1; x < x2; x++) {
                    map[y][x] = true;
                }
            }
        }

        for(int h = 0; h < H; h++) {
            for(int w = 0; w < W; w++) {
                if(!map[h][w]) {
                    dfs(h, w);
                    arrayList.add(count);
                    count = 1;
                }
            }
        }

        Collections.sort(arrayList);

        System.out.println(arrayList.size());
        for(int i : arrayList) {
            System.out.println(i);
        }

    }
}