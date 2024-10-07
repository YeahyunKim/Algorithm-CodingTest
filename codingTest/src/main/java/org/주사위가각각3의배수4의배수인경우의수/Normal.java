package org.주사위가각각3의배수4의배수인경우의수;

public class Normal {
    public static void main(String[] args) {
        //주사위가 a와 b가 각각 3의 배수 4의 배수로 나온 경우,
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 3, 4, 5, 6};
        int answer = 0;

        long startTime = System.nanoTime();

        for(int aa : a) {
            for(int bb : b) {
                if(aa % 3 == 0 && bb % 4 == 0) answer++;
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("총 걸린 시간 : " + duration + " nanoseconds");

        System.out.println(answer);
    }
}
