import java.util.*;
public class array2D {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
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
            System.out.println();
        }

        // Search for an element in the given array
        System.out.println("Enter the element to search in the array : ");
        int search = sc.nextInt();
        boolean found = false;

        for(int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (matrix[i][j]==search) {
                    found = true;
                    System.out.println("The number "+search+" is at index "+"["+i+","+j+"]");
                }
            } 
        }
        if (!found) {
            System.out.println("The number "+search+" is not found in the given matrix.");
        }

        sc.close();
    }
}