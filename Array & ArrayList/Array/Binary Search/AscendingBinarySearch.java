public class AscendingBinarySearch { 
    public static void main(String[] args) {
        
        int[] arr = {-234, -34, -8, 0, 5, 10, 12, 34, 156, 342, 1234, 1235};
        int target = 12;
        int li =0;
        int ei = arr.length-1;

        System.out.println(binarySearch(arr, target, li, ei));
    }

    private static int binarySearch(int[] arr,int target, int li, int ei) {

        if (li > ei) {
            return -1;
        }
        int mid = li + (ei - li) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        else if(arr[mid] < target) {
            return binarySearch(arr, target, mid+1, ei);
        }
        else {
            return binarySearch(arr, target, li, mid-1);
        }
    }
}
