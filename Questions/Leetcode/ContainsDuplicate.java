import java.util.*;
public class ContainsDuplicate{
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        System.out.println(contains(nums));
    }

    public static boolean contains(int[] nums){
        int n = nums.length;
        HashMap<Integer, Integer> duplicates = new HashMap<>();
        for(int i=0; i<n; i++){
            if(duplicates.containsKey(nums[i])){
                return true;
            }
            duplicates.put(nums[i], null);
        }
        return false;
    }
}