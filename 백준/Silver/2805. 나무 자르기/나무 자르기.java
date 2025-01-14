import java.util.Scanner;

public class Main {
    static int N, NeedTreeNum;
    static int[] treeHeight;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        NeedTreeNum = input.nextInt();

        treeHeight = new int[N];

        //나무 개수 넣기
        for(int i = 0; i < N; i++) {
            treeHeight[i] = input.nextInt();
        }
        System.out.println(getHeight());
    }

    public static int getHeight() {
        int l = 0;
        int r = 1000000000;

        int answer = -1;
        //한개의 값을 탐색할때는 <=
        while(l <= r) {
            int nowHeight = (l + r) / 2;

            if(isPossible(nowHeight)) {
                l = nowHeight + 1;
                answer = nowHeight;
            } else {
                r = nowHeight - 1;
            }

        }
        return answer;
    }

    public static boolean isPossible(int nowHeight2) {
        long leftTreeHeight = 0;

        for(int i = 0; i < N; i++) {
            if(treeHeight[i] > nowHeight2) leftTreeHeight += treeHeight[i] - nowHeight2;
        }

        return leftTreeHeight >= NeedTreeNum;
    }
}
