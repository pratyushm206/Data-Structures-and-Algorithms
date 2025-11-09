import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int x = sc.nextInt();
        System.out.println("Enter the power : ");
        int n = sc.nextInt();

        System.out.println(findPower(x, n));

        sc.close();
    }

    private static int findPower(int x, int n) {
        if (x == 0 && n == 0) {
            throw new IllegalArgumentException("0^0 is undefined.");
        }
        else if (x == 0) {
            return 0;
        }
        else if (n == 0) {
            return 1;
        }
        return x*findPower(x, n-1);
    }
}
