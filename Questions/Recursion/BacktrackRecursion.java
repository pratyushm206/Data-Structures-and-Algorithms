import java.util.Scanner;

public class BacktrackRecursion {
    
    // Printing the nubers form 1 to N usimg backtrack
    static void num(int i, int n) {
        if (i < 1) {
            return;
        }
        num(i-1, n);
        System.out.println(i);
    }

    // Printing from N to 1 using Backtrack
    static void revNum(int i, int n) {
        if (i > n) {
            return;
        }
        revNum(i+1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer to count: ");
        int n = sc.nextInt();

        num(n, n);

        revNum(1, n);

        sc.close();
    }
}
