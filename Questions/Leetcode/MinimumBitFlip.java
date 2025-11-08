public class MinimumBitFlip{
    public static void main(String[] args) {
        int  num= 3;
        int target = 4;
        int addCount = 0;
        int multiplyCount = 0;
        int xorCount = 0;
        int add = (num | target);
        int multiply = (num & target);

        while (add > 0){
            addCount += add & 1;
            add = add >> 1;
        }

        while (multiply > 0){
            multiplyCount += multiply & 1;
            multiply = multiply >> 1;
        }

        int xor = (num ^ target);
        while (xor > 0) {
            xorCount += xor & 1;
            xor = xor >> 1;
        }

        System.out.println("Total number of bit flip required is = "+(addCount - multiplyCount));
        System.out.println("Total number of bit flip required (by XOR) is = "+xorCount);
    }
}

