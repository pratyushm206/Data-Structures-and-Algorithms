public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 34, 9, 43, 57, 29, 8, 50};
        int si = 0, ei = arr.length-1;
        mergeSort(arr, si, ei);
    }
    // Method to divide and Conquer , dividing the array till its lenth reduces to 1.
    private static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) return;  // Base case
        int mid = si + (ei - si) / 2;
        // For dividing the array till its size reduced to 1
        mergeSort(arr, si, mid); // For left part
        mergeSort(arr, mid+1, ei); // For right part

        merge(arr, mid, si, ei); //Merging the sorted array 
    }
    private static void merge(int[] arr, int mid, int si, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
        printArray(arr);
    }
    // Printing the sorted array
    private static void printArray(int[] arr) {
        System.out.println("\nSorted array is : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}