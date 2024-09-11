class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = 0;
        int luy = wallpaper[0].length();
        int rdx = 0;
        int rdy = 0;
        int[] answer = new int[4];
        
        //lux 구하기
        for(String w : wallpaper) {
            if (w.contains("#")) {
                answer[0] = lux;
                break;
            } else {
                lux++;
                continue;
            }
        }
        
        //luy 구하기
        for(String w : wallpaper) {
            if (w.contains("#") && luy > w.indexOf("#")) {
                luy = w.indexOf("#");
                answer[1] = luy;
            } 

        }
        
        //rdx 구하기
        for(String w : wallpaper) {
            rdx++;
            if(w.contains("#")) {
                answer[2] = rdx;
                continue;
            }
        }
        
        //rdy 구하기
        for(String w : wallpaper) {
            if(w.contains("#") && rdy <= w.lastIndexOf("#")){
                rdy = w.lastIndexOf("#");
                answer[3] = rdy + 1;
            }
        }
        
        return answer;
    }
}