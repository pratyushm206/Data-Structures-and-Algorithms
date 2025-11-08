public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {12, 32, 12, 11, 90, 342, 12};
        System.out.println("Rotating the array by k places");
        int k = 5;
        int[] tempArr = new int[k];
        for(int i = 0; i < k; i++) {
            tempArr[i] = arr[i];
        }

        for(int i = k; i < arr.length; i++){
            arr[i-k] = arr[i];
        }

        for(int i = arr.length-k, j=0; i < arr.length; i++, j++){
            arr[i] = tempArr[j];
        }

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
