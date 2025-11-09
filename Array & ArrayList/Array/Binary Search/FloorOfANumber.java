public class FloorOfANumber {
    public static void main(String[] args) {
        
        int[] arr = {4, 15, 17, 17, 19, 20, 21, 22, 22, 25, 26, 26, 26, 28, 28, 28, 31, 31, 32, 33, 34, 34, 35, 36, 36, 37, 38, 38, 39, 41, 41, 42, 43, 43, 44, 44, 45, 45, 46, 47, 49, 49, 50, 50, 50, 51, 53, 54, 54, 56, 57, 58, 58, 59, 60, 64, 67, 69, 75, 94};
        int target = 26;
        int li =0;
        int ei = arr.length-1;
        System.out.println(ei);
        System.out.println(arr[11]);

        System.out.println(floorOfANumber(arr, target, li, ei));
    }

    private static int floorOfANumber(int[] arr, int target, int li, int ei) {
        if (li > ei) {
            return ei;
        }
        int mid = li + (ei-li) / 2;

        if (arr[mid] == target) {
                return mid;
            
        }

        else if (arr[mid] > target) {
            return floorOfANumber(arr, target, li, mid-1);
        }
        else if (arr[mid] < target) {
            return floorOfANumber(arr, target, mid+1, ei);
        }
        return -1;
    }
}


