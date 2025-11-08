public class PrimeNumber {
    public static void main(String[] args) {
        int n = 1901;

        if (n <= 1) {
            System.out.println("Not a prime number");
            return;
        }

        for(int i = 2; i*i <= n; i++) {
            if ( n % i == 0) {
                System.out.println("Not a prime number");
                return ;
            }
        }
        System.out.println("Prime number ");
    }
}
