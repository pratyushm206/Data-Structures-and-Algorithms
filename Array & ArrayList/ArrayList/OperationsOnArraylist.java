import java.util.ArrayList;
public class OperationsOnArraylist {
    public static void main(String[] args) {
        // Creating Arraylist, import hte arraylist from java util package
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(112);
        arr.add(34);

        System.out.println(arr);

        arr.get(0);
        arr.get(1);
        arr.get(2);
        arr.get(3);

        System.out.println(arr.size());
        arr.sort(null);
        System.out.println(arr);

        arr.remove(0);
        arr.clear();

        System.out.println(arr);
    }
}
