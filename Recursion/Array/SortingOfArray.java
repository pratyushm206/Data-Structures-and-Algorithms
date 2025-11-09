// Check whether given array is sorted or not
import java.util.*;
public class SortingOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }

        System.out.println(checkSorted(arr, 0));

        sc.close();
    }

    private static boolean checkSorted(int[] arr, int i) {
        if (i == arr.length-1 || arr.length==1) {
            return true;
        }
        if (arr[i] <= arr[i+1]) {
            return checkSorted(arr, i+1);
        }
        return false;
    }
}