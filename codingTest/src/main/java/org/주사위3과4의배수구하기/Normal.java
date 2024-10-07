package org.주사위3과4의배수구하기;

public class Normal {
    public static void main(String[] args) {
        long startTime = System.nanoTime(); // 종료 시간 측정

        //3의배수와 4의 배수의 총 개수 구하기
        int[] a2 = {1, 2, 3, 4, 5, 6};
        int[] b2 = {1, 2, 3, 4, 5, 6};
        int answer = 0;

        for(int a : a2) {
            for(int b : b2){
                if((a + b) % 3 == 0) answer ++;
                if((a + b) % 4 == 0) answer ++;
                if(a + b == 12) answer --;
            }
        }

        long endTime = System.nanoTime(); // 종료 시간 측정
        long duration = endTime - startTime; // 실행 시간 계산

        System.out.println("총 걸린 시간 : " + duration + " nanoseconds");
        System.out.println(answer);
    }
}
