class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;
        int index = 0;
        int[] arr = new int[nums1.length + nums2.length];

        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                arr[index++] = nums2[j++];
            }
            else{
                arr[index++] = nums1[i++];
            }
        }

        while (i < m) {
            arr[index++] = nums1[i++];
        }

        while (j < n) {
            arr[index++] = nums2[j++];
        }

        for(int k = 0; k < nums1.length + nums2.length; k++) {
            System.out.println(arr[k]);
        }

        // Median
        double median = 0;
        if (arr.length%2 == 0) {
            median = (double)(arr[arr.length/2 - 1] + arr[arr.length/2]) / 2;
        }
        else if (arr.length % 2 != 0) {
            median = arr[arr.length/2];
        }
        return median;
    }
}