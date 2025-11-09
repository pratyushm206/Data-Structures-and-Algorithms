import java.util.*;
public class PowerOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int x = sc.nextInt();
        System.out.println("Enter the power : ");
        int n = sc.nextInt();

        System.out.println(findPowerOptimised(x, n));

        sc.close();
    }

    private static int findPowerOptimised(int x, int n) {
        if (x == 0 && n == 0) {
            throw new IllegalArgumentException("0^0 is undefined.");
        }
        else if (x == 0) {
            return 0;
        }
        else if (n == 0) {
            return 1;
        }
        int power = findPowerOptimised(x, n/2);
        int halfPowerSq = power * power;

        if (n%2 != 0) {
            halfPowerSq = x*halfPowerSq;
        }
        return halfPowerSq;
    }
}