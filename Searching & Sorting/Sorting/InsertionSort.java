public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {2, 3, 12, 54, 23, 7,-3, 0, 80, 2};

        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i-1;
            while (j >= 0 && val < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
 
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
