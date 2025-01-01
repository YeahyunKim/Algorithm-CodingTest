import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] now = input.next().split(":");
        String[] later = input.next().split(":");
        StringBuilder sb = new StringBuilder();
        int convertNow = 0;
        int convertLater = 0;

        for(int i = 0; i < now.length; i++) {

            if(i == 0) {
                convertNow += Integer.parseInt(now[i]) * 60 * 60;
                convertLater += Integer.parseInt(later[i]) * 60 * 60;
            }

            if(i == 1) {
                convertNow += Integer.parseInt(now[i]) * 60;
                convertLater += Integer.parseInt(later[i]) * 60;
            }

            if(i == 2) {
                convertNow += Integer.parseInt(now[i]);
                convertLater += Integer.parseInt(later[i]);
            }
        }

        int convertTime = convertLater - convertNow;
        
        if(convertTime <= 0) {
            convertTime += 24 * 60 * 60;
        }

        int hour = convertTime / 3600;
        int minutes = (convertTime % 3600) / 60;
        int seconds = convertTime % 60;
        
        System.out.printf("%02d:%02d:%02d",hour,minutes,seconds);

    }
}
