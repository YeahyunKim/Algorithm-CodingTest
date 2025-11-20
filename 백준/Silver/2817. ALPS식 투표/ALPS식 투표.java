import java.util.*;

public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

        int VOTECOUNT = input.nextInt();
        double CUTLINE = VOTECOUNT * 0.05;

        ArrayList<ArrayList<Double>> arrayList = new ArrayList<>();


        int N = input.nextInt();


        int size = 0;
        for(int i = 0; i < N; i++) {
            String staffStr = input.next();

            double staff = staffStr.charAt(0);
            double vote = input.nextInt();

            if(vote >= CUTLINE) {
                arrayList.add(new ArrayList<>());
                arrayList.get(size).add(staff);
                arrayList.get(size).add(vote);
                size++;
            }
        }

        Map<Character, Integer> map = new TreeMap<>();
        
        ArrayList<ArrayList<Double>> copyList = new ArrayList<>();

        for(int i = 0; i < arrayList.size(); i++) {
            for(int j = 1; j <= 14; j++) {
                int index = i * 14 + (j - 1);
                copyList.add(new ArrayList<>());
                copyList.get(index).add(arrayList.get(i).get(0));
                copyList.get(index).add(arrayList.get(i).get(1) / j);
            }
            char a = (char)(arrayList.get(i).get(0).doubleValue());
            map.put(a, 0);
        }

        Collections.sort(copyList, new Comparator<ArrayList<Double>> () {
            @Override
            public int compare(ArrayList<Double> o1, ArrayList<Double> o2) {
                return Double.compare(o2.get(1), o1.get(1));
            }

        });


        for(int i = 0; i < 14; i++) {
            char a = (char)(copyList.get(i).get(0).doubleValue());
                map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
    }   
}