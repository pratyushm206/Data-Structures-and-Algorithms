import java.util.Scanner;

public class question2Darray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the array

        System.out.println("Enter the row and column of the matrix : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matrix = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print("Enter the element ("+i+","+j+") : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix you entered is : ");
        for(int i = 0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println("\n");
        }

        // Printing the spiral order matrix as output of the given matrix

        System.out.println("\nThe spiral order matrix of the given matrix is :");
        int row_start = 0;
        int row_end = n-1;
        int column_start = 0;
        int column_end = m-1;

        while (row_start <= row_end && column_start <= column_end) {

            for(int column = column_start; column <= column_end; column++) {
                System.out.print(matrix[row_start][column]+", ");
            } 
            row_start+=1;
            
            for(int row=row_start; row<=row_end; row++) {
                System.out.print(matrix[row][column_end]+", ");
            }
            column_end-=1;

            for(int column=column_end; column>=column_start; column--) {
                System.out.print(matrix[row_end][column]+", ");
            }
            row_end-=1;

            for(int row=row_end; row>=row_start; row--) {
                System.out.print(matrix[row][column_start]+", ");
            }
            column_start+=1;
        }

        sc.close();
    }
}