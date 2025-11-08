import java.util.*;
public  class sorting {

    public static void bubbleSorting(int arr[], int n) {
        // Time complexity is 0(n^2)

        System.out.println("Sortng the array using buble sort ");
        
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array is :");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[], int n) {
        // Sorting using selection sort
        // Time complexity is 0(n^2)
        System.out.println("\nSorting the array using selection sort ");
        for(int i=0; i<n-1; i++) {
            int smallest = i;
            for(int j=i+1; j<n-1; j++) {
                if (arr[smallest]>arr[j+1]) {
                    smallest=j+1;
                }
                
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        // Printing the sorted array
        System.out.println("Sorted array is :");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println("\n");
    }

    public static void insertionSort(int arr[], int n) {
        // TIme complexity is O(n^2)
        System.out.println("Sorting the array using insertion sort");

        for(int i=1; i<n; i++) {
            int current = arr[i];
            int j = i-1;
            while (j>=0 && (current < arr[j]) ) {
                arr[j+1] = arr[j] ;
                j--; 
            }

            arr[j+1] = current;
        }

        // Printing the sorted array
        System.out.println("Sorted array is :");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Enter element arr["+i+"] :");
            arr[i] = sc.nextInt();
        }

        bubbleSorting(arr, n);
        selectionSort(arr, n);
        insertionSort(arr, n);

        sc.close();
    }
    

}