public class MaxInTwoDArray {
    
    public static void main(String[] args) {
        int[][] arr = {
                        {11, 23, 54},
                        {6, 67, 34, 32, 234},
                        {22, 12, 56, 34, 13},
                        {90, 10},
                        {100, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        };

        System.out.println("Maximum element of array is "+maximum(arr));
    }

    static int maximum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        System.out.println("This is the minimum of an integer value  "+max);
        for(int i = 0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
