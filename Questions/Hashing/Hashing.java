import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int arr[] = new int[n];
        for(int i=0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        System.out.println("Enter the no. of elements you want to search:");
        int m = sc.nextInt();
        int[] querryArray = new int[m];
        System.out.println("Enter the elements you want to search in the given array :");
        for(int i = 0; i < m; i++) {
            querryArray[i] = sc.nextInt();

        }
        int max = querryArray[0];
        for(int i = 1; i < m; i++) {
            if (querryArray[i]>=querryArray[i-1]) {
                max = querryArray[i];
            }
        }


        System.out.println("The maximum value of element in your search array is: "+max);
        int[] hashArray = new int[max+1];
        for(int i = 0; i < max ; i++) {
            hashArray[i] = 0;
        }

        sc.close();
        
        hashing(hashArray, querryArray, arr, n, m);
    }


    static void hashing(int[] hashArray, int[] querryArray, int[] arr, int n, int m) {
        // Querry array
        for(int i = 0; i < n; i++) {
            hashArray[arr[i]] +=1;
        }
        System.out.println("Frequencies of Querried elements are : ");
        for(int i = 0; i < m; i++) {
            System.out.println(querryArray[i]+" -> "+hashArray[querryArray[i]]);
        }
    }
}