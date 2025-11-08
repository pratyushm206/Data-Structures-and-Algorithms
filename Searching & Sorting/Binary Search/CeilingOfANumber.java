// Ceiling of a number is to find a number in the array which is greater than or equal to the target element.

public class CeilingOfANumber {
    
    public static void main(String[] args) {
        
        int[] arr = {-234, -34, -8, 12, 34, 156, 342, 1234, 1235};
        int target = 1235;
        int li =0;
        int ei = arr.length-1;



        // By basic approach
        if (target <= arr[0]) {
            System.out.println(arr[0]);
        }
        for(int i=1; i<arr.length; i++) {
            if (target > arr[i-1] && target <= arr[i]) {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("Target element is greater than the largest element of the given array.");


        // By Binary Search approach
        System.out.println(ceiling(arr, target, li, ei));
    }

    private static int ceiling(int[] arr, int target, int li, int ei) {
        if (li > ei ) {
            if (li < arr.length) {
                return arr[li];
            }
            else {
                return -1;
            }
        }
        int mid = li + (ei - li) / 2;

        if (target == arr[mid]) {
            return arr[mid];
        }

        else if (target > arr[mid]) {
            return ceiling(arr, target, mid+1, ei);
        }
        else if (target < arr[mid]) {
            return ceiling(arr, target, li, mid-1);
        }
        return -1;
    }
}
