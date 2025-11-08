public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 32, 12, 11, 90, 342, 12, 53, 0, 23, 123, 45, 84, 3, 321, 86};
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length ; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
        System.out.println(max);
    }
}
