public class DescendingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {150, 140, 130, 120, 110, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0, -10, -20, -30};
        int target = 55;
        int li = 0;
        int ei = arr.length - 1;

        System.out.println(binarySearch(arr, target, li, ei));
    }

    private static int binarySearch(int[] arr, int target, int li, int ei) {
        if (li > ei) {
            return -1;
        }
        int mid = li + (ei - li) / 2;

        if (target == arr[mid]) {
            return mid;
        }
        if (target > arr[mid]) {
            return binarySearch(arr, target, li, mid-1);
        }
        else if(target < arr[mid]) {
            return binarySearch(arr, target, mid+1, ei);
        }
        return mid;
    }
}
