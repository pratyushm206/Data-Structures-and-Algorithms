public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {100, 400, 420, 100, 200, 500};
        System.out.println(rob(nums));
    }
    
    public static  int rob(int[] nums) {
        int sum = 0;
        return helper(nums, sum, 0);
    }
    
    public static int helper(int[] nums, int sum, int index) {
        if(index >= nums.length) {
            return sum;
        }
        int steel = helper(nums, sum+nums[index], index+2);
        int skip = helper(nums, sum, index+1);
        return sum = Math.max(steel, skip);
    }
}