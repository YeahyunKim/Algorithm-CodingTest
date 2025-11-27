import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
        int W = Integer.parseInt(st.nextToken());
        
        int H = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int p = Integer.parseInt(st.nextToken());
        
        int q = Integer.parseInt(st.nextToken());
        
        int t = Integer.parseInt(br.readLine());
        
        p = (p + t) % (2 * W);
        q = (q + t) % (2 * H);
        
        if(p > W) p = (2*W - p);
        if(q > H) q = (2*H - q);
        
        System.out.println(p + " " + q);
    }
}