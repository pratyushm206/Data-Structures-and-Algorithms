public class RemoveDuplicateElementsInSortedArray {
    public static void main(String[] args) {
        int i = 0;
        int[] nums = {12, 12, 323, 323, 323, 323, 5455, 5455};
        for(int j=1; j<nums.length; j++) {
            if(nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        System.out.println(nums);
    }
}