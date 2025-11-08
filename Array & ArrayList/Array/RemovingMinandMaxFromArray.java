public class RemovingMinandMaxFromArray {
    public static void main(String[] args) {
        int[] nums = {0,-4,19,1,8,-2,-3,5};
        minimumDeletions(nums);
        // System.out.println(minimumDeletions(nums));
    }

    public static void minimumDeletions(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int maxplace=0, minplace=0;
        int n = nums.length;

        for(int i=0; i <nums.length-1; i++) {
            if(min > nums[i]) {
                min = nums[i];
                minplace = i;
            }
            else if(max < nums[i]) {
                max = nums[i];
                maxplace = i;
            }
        }
        System.out.println("minplace="+minplace+"min="+min);
        System.out.println("maxplace= "+maxplace+"max="+max);
        
        if(minplace > n/2) {
            minplace = n - minplace;
        }
        else if(minplace <=n/2) {
            minplace = minplace+1;
        }
        System.out.println("minlength= "+minplace);
        
        if(maxplace <= n/2) {
            maxplace = maxplace+1;
        }
        else if(maxplace > n/2) {
            maxplace = n - maxplace;
        }
        System.out.println("maxlength="+maxplace);

        int result = minplace+maxplace;
        System.out.println(result);
        // return result;
    }
}
