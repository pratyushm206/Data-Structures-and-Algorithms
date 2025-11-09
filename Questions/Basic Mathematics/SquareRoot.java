public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(sqrt(n, p));
    }
    public static double sqrt(int n, int p) {
        int s = 0;
        int e = n;
        while (s<=e) {
            int mid = s + (e-s)/2 ;
            
            if (mid*mid == n) {
                return mid;
            }
            if (mid*mid < n) {
                return sqrt(n, p);
            }
        }
    }
}
