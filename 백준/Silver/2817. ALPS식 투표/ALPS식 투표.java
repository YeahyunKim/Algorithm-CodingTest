import java.util.*;

public class Main {
    public static class Score {
        int staffIndex;
        double score;

        public Score(int staffIndex, double score) {
            this.staffIndex = staffIndex;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();  //참가자수
        int N = input.nextInt(); //매니저수

        double validCut = X * 0.05;

        boolean[] validCandidate = new boolean[26];
        int[] staffVoted = new int[26];
        int candidateCount = 0;

        for(int i = 0; i < N; i++) {
            String name = input.next();
            int vote = input.nextInt();

            if(vote >= validCut) {
                int index = name.charAt(0) - 'A';
                validCandidate[index] = true;
                staffVoted[index] = vote;
                candidateCount++;
            }
        }

        Score[] scores = new Score[candidateCount * 14];

        int scoreIndex = 0;

        for(int i = 0; i < staffVoted.length; i++) {
            if(staffVoted[i] != 0) {
                for(int j = 1; j <= 14; j++) {
                    scores[scoreIndex++] = new Score(i, (double)staffVoted[i] / j);
                }
            }
        }
        Arrays.sort(scores, new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                return (int) (o2.score - o1.score);
            }

        });
        int[] answer = new int[26];

        for(int i = 0; i < 14; i++) {
            answer[scores[i].staffIndex]++;
        }

        for(int i = 0; i < validCandidate.length; i++) {
            if(validCandidate[i]) {
                System.out.println((char) (i + 'A') + " " + answer[i]);
            }
        }

//        for(int i = 0; i < scores.length; i++) {
//            System.out.println(scores[i].staffIndex + " : " + scores[i].score);
//        }
    }
}
