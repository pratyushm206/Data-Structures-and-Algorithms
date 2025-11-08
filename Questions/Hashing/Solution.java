public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,1,2,1};
        int val = 1;
        System.out.println(removeElement(nums, val));
        
    }
    static int[] removeElement(int[] nums, int val) {
        int count = 0;
        int j = 0;
        int arr[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                count = count + 1;
            }
            else {
                arr[j] = nums[i];
                j+=1;
            }
        }

        int[] result = new int[j];
        for(int i = 0; i<j; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}

