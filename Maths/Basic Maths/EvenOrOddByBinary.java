public class EvenOrOddByBinary {
    public static void main(String[] args) {
        int n = 21;
        System.out.println(odd(n));
    }
    private static boolean odd(int n) {
        return (n&1) == 1;
    }
}