public class Recursion3 {

    public static void main(String[] args) {
        int n = 20;
        int n1 = 20;

        sum(n, 0);

        System.out.println(sum2(n1));
    }

    //  Paramatrised way
    static void sum(int n, int sum) {
        if (n<1) {
            System.out.println(sum);
            return ;
        }
        sum(n-1 , sum+n);
    }

    // Non Paramatrised way
    static int sum2(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum2(n-1);
    }
}