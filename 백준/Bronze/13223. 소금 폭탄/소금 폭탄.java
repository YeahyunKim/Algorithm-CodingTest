import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] nowStr = input.next().split(":");
        String[] reserveStr = input.next().split(":");
        int now = 0;
        int reserve = 0;
        
        for(int i = 0; i < nowStr.length; i++) {
            if(i == 0) {
                now += Integer.parseInt(nowStr[i]) * 60 * 60;
                reserve += Integer.parseInt(reserveStr[i]) * 60 * 60;
            }
            
            if(i == 1) {
                now += Integer.parseInt(nowStr[i]) * 60;
                reserve += Integer.parseInt(reserveStr[i]) * 60;
            }
            
            if(i == 2) {
                now += Integer.parseInt(nowStr[i]);
                reserve += Integer.parseInt(reserveStr[i]);
            }
        }
        
        if(now >= reserve) {
            reserve += 24 * 60 * 60;
        }
        
        int convertTime = reserve - now;

        int hour = convertTime / 3600;
        int minutes = (convertTime % 3600) / 60;
        int seconds = convertTime % 60;


        System.out.printf("%02d:%02d:%02d",hour,minutes,seconds);
    }
}