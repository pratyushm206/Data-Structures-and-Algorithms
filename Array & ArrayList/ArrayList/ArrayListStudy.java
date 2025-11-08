import java.util.*;
public class ArrayListStudy {
    public static void main(String[] args) {
            
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        arr.add(5);
        arr.add(345);
        arr.add(321);
        System.out.println(arr);

        System.out.println(arr.size());
        arr.sort(null);
        
        System.out.println(arr);
    }
}

