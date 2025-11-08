import java.util.*;

public class transposeOfMatrix {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column of the matrix : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] matrix = new int[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("Enter the element ("+i+","+j+") : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix you entered is : ");
        for(int i = 0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();

        // Transpose of matrix
        System.out.println("\nTranspose of given matrix is : ");

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
