import java.util.ArrayList;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 65, 345};
        int[] arr2 = {2, 4, 6, 8, 12, 34};
        ArrayList<Integer> list = new ArrayList<>();
        merge(arr1, arr2, 0, 0, list);
        System.out.println(list);

    }
    static ArrayList<Integer> merge(int[] arr1, int[] arr2, int i, int j, ArrayList<Integer> list) {
        if (i == arr1.length && j == arr2.length) {
            return list;
        }
        if (i == arr1.length) {
            list.add(arr2[j]);
            return merge(arr1, arr2, i, j+1, list);
        }
        if (j == arr2.length) {
            list.add(arr1[i]);
            return merge(arr1, arr2, i+1, j, list);
        }
        if (arr1[i] <= arr2[j]) {
            list.add(arr1[i]);
            return merge(arr1, arr2, i+1, j, list);
        }
        else {
            list.add(arr2[j]);
            return merge(arr1, arr2, i, j+1, list);
        }
    }
}
