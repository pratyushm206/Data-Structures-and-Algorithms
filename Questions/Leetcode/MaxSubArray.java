public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = arr[0];
        int currSum = arr[0];

         // Optimal
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] + currSum > arr[i]) {
                currSum += arr[i];
            }
            else {
                currSum = arr[i];
            }
            maxSum = Math.max(maxSum, currSum);

        }
        System.out.println(maxSum);

        bruteforce(arr);
        

    }

    // BruteForce
    public static void bruteforce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println("MaxSum by brute force (optimized) = " + maxSum);
    }
}

