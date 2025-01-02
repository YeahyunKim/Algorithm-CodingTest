import java.util.*;

public class Main{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        input.nextLine();

        LinkedList<Integer> linkedList = new LinkedList<>();



        for(int i = 0; i < N; i++) {
            String[] sList = input.nextLine().split(" ");

            int answer = 0;

            linkedList.add(Integer.parseInt(sList[1]));
            for (int j = 2; j <= 20; j++) {

                int index = -1;

                for(int k = 0; k < linkedList.size(); k++) {
                    if(linkedList.get(k) > Integer.parseInt(sList[j])) {
                        index = k;
                        break;
                    }
                }

                if(index == -1){
                    linkedList.add(Integer.parseInt(sList[j]));
                } else{
                    answer += linkedList.size() - index;
                    linkedList.add(index, Integer.parseInt(sList[j]));
                }


            }
            System.out.println((i+1) + " " + answer);
            linkedList.clear();

        }
   }
}