import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        List<Integer> lostList = new ArrayList<Integer>();
        List<Integer> reserveList = new ArrayList<Integer>();

        int tmp = 0;
        for (int i = 0; i < lost.length - 1; i++) {
            for (int j = i + 1; j < lost.length; j++) {
                if (lost[i] < lost[j]) {
                    tmp = lost[i];
                    lost[i] = lost[j];
                    lost[j] = tmp;
                }
            }
        }
        for (int i = 0; i < reserve.length - 1; i++) {
            for (int j = i + 1; j < reserve.length; j++) {
                if (reserve[i] < reserve[j]) {
                    tmp = reserve[i];
                    reserve[i] = reserve[j];
                    reserve[j] = tmp;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            lostList.add(lost[i]);
        }
        for (int i = 0; i < reserve.length; i++) {
            reserveList.add(reserve[i]);
        }

        for (int i = 0; i < lostList.size(); i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                if (lostList.get(i) == reserveList.get(j)) {
                    lostList.remove(i);
                    reserveList.remove(j);
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < lostList.size(); i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                if (lostList.get(i) == reserveList.get(j) - 1) {
                    lostList.remove(i);
                    reserveList.remove(j);
                    i--;
                    break;
                } else if (lostList.get(i) == reserveList.get(j) + 1) {
                    lostList.remove(i);
                    reserveList.remove(j);
                    i--;
                    break;
                }
            }
        }
        answer = n - lostList.size();
        return answer;
    }
}