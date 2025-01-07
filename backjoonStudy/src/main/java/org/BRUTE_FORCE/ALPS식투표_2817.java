package org.BRUTE_FORCE;

import java.util.*;

public class ALPS식투표_2817 {

    public static class Score {
        int managerIndex;
        double score;

        public Score(int managerIndex, double score) {
            this.managerIndex = managerIndex;
            this.score = score;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int customers = input.nextInt(); // 참가자 수
        int managers = input.nextInt(); // 매니저 수

        double validCut = customers * 0.05;

        int[] staffVoted = new int[26];
        boolean[] validManagers = new boolean[26];

        int vaildManagerCount = 0;

        for(int i = 0; i < managers; i++) {
            String name = input.next();
            int vote = input.nextInt();

            if(vote >= validCut) {
                int index = (name.charAt(0) - 'A');
                validManagers[index] = true;
                staffVoted[index] = vote;
                vaildManagerCount++;
            }
        }

        Score[] scores = new Score[vaildManagerCount * 14];
        int scoreIndex = 0;

        for(int i = 0; i < staffVoted.length; i++) {
            if(staffVoted[i] != 0) {
                for(int j = 1; j <= 14; j++) {
                    scores[scoreIndex++] = new Score(i, (double) staffVoted[i] / j);
                }
            }
        }

        Arrays.sort(scores, new Comparator<Score>() {
            public int compare(Score o1, Score o2) {
                return (int) (o2.score - o1.score);
            }
        });


        int[] answer = new int[26];

        for(int i = 0; i < 14; i++) {
            answer[scores[i].managerIndex]++;
        }

        for(int i = 0; i < answer.length; i++) {
            if(staffVoted[i] != 0) {
                System.out.println(((char) (i + 'A')) + " " + answer[i]);
            }
        }

    }

}
