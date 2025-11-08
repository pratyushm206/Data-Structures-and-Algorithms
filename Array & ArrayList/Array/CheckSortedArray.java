public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 12, 23};
        for(int i = 1; i< arr.length ; i++) {
            if (arr[i] >= arr[i-1]) {
                continue;
            }
            else{
               System.out.println("Not Sorted"); 
               break;
            }
        }
    }
}
