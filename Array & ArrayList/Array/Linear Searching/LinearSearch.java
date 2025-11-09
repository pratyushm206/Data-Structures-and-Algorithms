public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 10, 15, 25, 29, 32, 35, 50, 75, 100};
        int target = 32;

        int result = linearSearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

