public class ReverseTheNumber {
    public static void main(String[] args) {
        int n = -123;
        int ans = 0;
        System.out.println(helper(n,ans));

    }
    static int helper(int n, int ans) {
        if (n==0) {
            return ans;
        }
        int rem = n%10;
        ans = ans*10 + rem;
        // System.out.println(ans);
        return helper(n/10, ans);
    }
}
