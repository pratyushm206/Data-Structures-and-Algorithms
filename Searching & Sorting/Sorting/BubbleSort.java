public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {2, 3, 12, 54, 23, 7,-3, 0, 80, 2};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}