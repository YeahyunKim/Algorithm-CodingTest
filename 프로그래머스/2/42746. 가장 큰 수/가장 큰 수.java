import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        // 정수를 문자열로 변환
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // 정렬 기준 정의
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // o1 + o2와 o2 + o1을 비교
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        // 정렬된 문자열 배열을 이어 붙임
        StringBuilder result = new StringBuilder();
        for (String str : strNumbers) {
            result.append(str);
        }

        // 결과가 "0"인 경우를 처리
        if (result.charAt(0) == '0') {
            return "0";
        }

        return result.toString();
    }
}