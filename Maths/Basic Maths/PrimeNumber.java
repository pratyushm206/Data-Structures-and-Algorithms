import java.util.*;
public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] primes = new boolean[n+1];
        isPrime(n, primes);
        sc.close();;
    }
    public static void isPrime(int n, boolean[] primes) {
        for(int i = 2; i*i <= n; i++) {
            if (! primes[i]) {
                for(int j = i*2; j<= n; j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i = 2; i<=n; i++) {
            if (! primes[i]) {
                System.out.print(i+" ");
            }
        }
    }
}
// Complexity is n*log(log n)