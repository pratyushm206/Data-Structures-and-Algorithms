import java.util.*;

public class ArrayListTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // Creates a 2D Array

        // Initilisation of 2D ArrayList
        for(int i= 0; i< 5; i++) {
            list.add(new ArrayList<>());
        }

        // Adding elements to ArrayList

        for(int i=0; i<3; i++) {
            for(int j=0; j<5; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
        sc.close();
    }
}
