public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 9, 12, 23, 23};
        int j = 1;
        for(int i = 1; i < arr.length ; i++) {
            if (arr[i] > arr[i-1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        System.out.println("Length of array after removing duplicate elements is: "+j);
        for(int i = 0; i < j; i++ ){
            System.out.println(arr[i]);
        }
    }
}
