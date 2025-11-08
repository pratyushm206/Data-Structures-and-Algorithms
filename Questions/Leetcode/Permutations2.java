import java.util.*;
public class Permutations2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int index = 0;
        List<Integer> processed = new ArrayList<>();

        System.out.println(helper(arr, processed, index));
    }
    static List<List<Integer>> helper(int[] arr, List<Integer> processed, int index){
        List<List<Integer>> ans = new ArrayList<>();
        if (index == arr.length) {
            List<List<Integer>> base = new ArrayList<>();
            base.add(new ArrayList<>(processed));  // save one permutation
            return base;
        }

        int current = arr[index];
        for (int i = 0; i <= processed.size(); i++) {
            List<Integer> copy = new ArrayList<>(processed);
            copy.add(i, current);
            ans.addAll(helper(arr, copy, index+1));
        }
        return ans;
    }
}
