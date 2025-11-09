public class CountZeroes {
    public static void main(String[] args) {
        int n = 203400;
        int count = 0;
        System.out.println(countZeroes(n,count));
    }
    static int countZeroes(int n, int count) {
        if (n == 0) {
            return count;
        }

        else if (n%10 == 0) {
            count+=1;
            n /= 10;
            return countZeroes(n, count);
        }

        else {
            n/=10;
            return countZeroes(n, count);
        }
    }
}
