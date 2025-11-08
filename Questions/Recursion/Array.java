import java.util.Arrays;

public class Array {

    static int[] recursion(int arr[], int start, int end) {
        if (start > end) {
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return recursion(arr, start+1, end-1);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start < end) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end] ;
            arr[start] = arr[start] - arr[end];

            start++;
            end--;
        }
        System.out.println(arr); //You're printing the reference to the array object — not the contents. So you'll get output like [I@372f7a8d
        System.out.println(Arrays.toString(arr));

        System.out.println("By recursion \n"+Arrays.toString(arr));
    }
}