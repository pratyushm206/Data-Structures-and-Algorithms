// Check if the array is sorted or not
public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 32, 54, 56, 230 , 255};
        int i = 1;
        System.out.println(helper(arr, i));
    }
    static boolean helper(int[] arr, int i) {
        if (i == arr.length) {
            return true;
        }
        if (arr[i-1] <= arr[i]) {
            return helper(arr, i+1);
        }
        return false;
    }
}
