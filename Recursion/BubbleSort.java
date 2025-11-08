public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 4, 23, 1, 0, 89, 10, 0};
        sort(arr, 0, arr.length-1);
        for(int i=0; i< arr.length; i ++){
            System.out.print(arr[i]+" ");
        }
        
    }
    static int[] sort(int[] arr, int index, int end) {
        if (end <= 1) {
            return arr;
        }
        for(int i = 0; i< end ; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return sort(arr, index, end-1);
    }
}
