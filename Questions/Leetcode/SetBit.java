public class SetBit{
    public static void main(String[] args) {
        int m = 32;
        int n = m;
        int o = m;
        int p = o;
        int q = p;
        int r = q;
        int s = r;
        int i = 2;

        if ((n & (1<<i)) != 0) {
            System.out.println("i'th bit is "+1);
        }
        else{
            System.out.println("i'th bit is "+0);
        }

        if (((n>>i) & 1) != 0) {
            System.out.println("i'th bit is "+1);
        }
        else{
            System.out.println("i'th bit is "+0);
        }

        // Setting i'th bit

        m = m | (1 << i) ;
        System.out.println("Setting i'th bit "+m);

        // Clearing i'th bit

        o = o & (~(1<<i)) ;
        System.out.println("Clearing i'th bit "+o);

        // Toggle bit 1-> 0, 0-> 1

        p = p ^ (1<<i);
        System.out.println("Toggle i'th bit "+p);

        // Remove rightmost(last) set bit
        q = q & (q-1);
        System.out.println("Remove rightmost set bit "+q);

        // Check number is power of 2 or not
        if ((r & (r-1)) == 0) {
            System.out.println("Number is power of 2");
        }
        else {
            System.out.println("Number is not power of 2");
        }

        // Count no. of set bits
        int count = 0;
        while(s > 0){
            count += s&1;
            s = s>>1;
        }
        System.out.println("Number of set bits = "+count);
    }
}