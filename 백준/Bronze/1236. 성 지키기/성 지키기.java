import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int row = 0;
		int col = 0;
		char[][] map = new char[N][M];
		for(int i=0; i<map.length; i++) {
			String str = scan.next();
			for(int j=0; j<map[i].length; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0; i<N; i++) {
			boolean flag = true;
			for(int j=0; j<M; j++) {
				if(map[i][j] == 'X') {
					flag = false;
					break;
				}
			}
			if(flag)
				row ++;
		}
		
		for(int i=0; i<M; i++) {
			boolean flag = true;
			for(int j=0; j<N; j++) {
				  if(map[j][i] == 'X') {
					  flag = false;
					  break;
				  }
			}
			if(flag)
				col ++;
		}
		
		System.out.println(Math.max(row, col));
		scan.close();
	}

}