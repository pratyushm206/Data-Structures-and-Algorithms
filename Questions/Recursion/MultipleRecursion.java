public class MultipleRecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The nth fibonacci number is :"+fibonacciNum(n));
        fibonacciSeries(n);
    }

    private static int fibonacciNum(int n) {
        if (n==1) {
            return 0;
        }
        if (n==2) {
            return 1;
        }
        return fibonacciNum(n-1) + fibonacciNum(n-2);
    }

    private static void fibonacciSeries(int n) {
       int a = 0;
       int b = 1;
       System.out.print(a+", "+b);
       for(int i = 2; i < n; i++) {
        int c = a+b;
        System.out.print(", "+c);
        a = b;
        b = c ;
       }

    }
}
