public class SearchInTwoDArray {
    public static void main(String[] args) {
        
        int[][] arr = {
                        {1, 23, 54},
                        {6, 67, 34, 32, 234},
                        {22, 12, 56, 34, 123},
                        {90, 10},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        };

        int target = 87;

        search(arr, target);
    }

    static void search(int[][] arr, int target) {
        for(int i = 0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Row is "+i+"\nColumn is "+j);
                    return;
                }
            }
        }
        System.out.println("Element not found in the array");
    }
}
