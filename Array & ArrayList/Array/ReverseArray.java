import java.util.*;
public class ReverseArray {
    
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // Revesing the array

        for(int i=0; i<=n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        // Printing the reversed array

        System.out.println("Reversed array is: ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
