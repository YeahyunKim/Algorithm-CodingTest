import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String current = sc.next();
        String drop = sc.next();

        int currentHour = (current.charAt(0) + '0') * 10 + current.charAt(1) + '0';
        int currentMinute = (current.charAt(3) + '0') * 10 + current.charAt(4) + '0';
        int currentSecond = (current.charAt(6) + '0') * 10 + current.charAt(7) + '0';
        int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;

        int dropHour = (drop.charAt(0) + '0') * 10 + drop.charAt(1) + '0';
        int dropMinute = (drop.charAt(3) + '0') * 10 + drop.charAt(4) + '0';
        int dropSecond = (drop.charAt(6) + '0') * 10 + drop.charAt(7) + '0';
        int dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond;

        int needSecondAmount = dropSecondAmount - currentSecondAmount;
        if (needSecondAmount <= 0)
            needSecondAmount += 24 * 3600;
        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60;
        int needSecond = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }
}
