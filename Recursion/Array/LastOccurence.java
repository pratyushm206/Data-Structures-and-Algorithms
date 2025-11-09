import java.util.*;
public class LastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to search : ");
        int value = sc.nextInt();

        System.out.println("The last occurence of number "+value+" is at index  : "+lastOccurence(arr , value, n-1));
        
        sc.close();
    }

    private static int lastOccurence(int[] arr, int val, int i) {
        if (i == 0) {
            if (arr[i] == val) {
                return i;
            }
            return -1;
        }
        else if(arr[i] == val) {
            return i;
        }
        return lastOccurence(arr, val, i-1);
    }
}
