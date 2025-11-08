import java.util.Scanner;

public class LargestTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[1][4];
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the element "+i+" , "+j);
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
}
