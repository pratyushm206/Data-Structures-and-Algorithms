public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 111;
        int dub = n;
        int cubeNums = 0;
        
        while(dub>0) {
            int lastDigit = dub%10;
            dub = dub/10;
            cubeNums = cubeNums + (lastDigit * lastDigit * lastDigit);
            System.out.println(cubeNums);
        }
        if (cubeNums == n) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}