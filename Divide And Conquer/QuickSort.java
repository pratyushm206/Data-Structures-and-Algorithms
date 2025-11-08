import java.util.*;
public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int si = 0;
        int ei = n-1;
        quickSort(arr, si, ei);
        printArray(arr);
        sc.close();
    }


    private static void quickSort(int[] arr, int si, int ei) {

        if (si >= ei) return; // Base condition

        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex-1); //Left side
        quickSort(arr, pivotIndex+1, ei); //Right side
    }


    private static int partition(int[] arr, int si, int ei) {

        int pivot = arr[ei];
        int i = si - 1; // Create space for elements smaller than pivot
        for(int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;
        return i+1;
    }

    // Printing the sorted array
    private static void printArray(int[] arr) {
        System.out.println("\nSorted array is : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}