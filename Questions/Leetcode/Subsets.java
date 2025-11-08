import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = new ArrayList<>();
        System.out.println(subsets(arr, ans));

    }
    public static List<List<Integer>> subsets(int[] arr, List<List<Integer>> ans){
        int n = arr.length;
        int size = 1 << n;
        
        for (int i = 0; i < size; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1<<j)) != 0){
                    sub.add(arr[j]);
                }
            }
            Collections.sort(sub);
            if (!ans.contains(sub)) {
                ans.add(sub);
            }
        }
        return ans;
    }
}
