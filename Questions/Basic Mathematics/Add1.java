import java.util.*;
class Add1 {
    public static void main(String[] args) {
        int[] digits = {9};
        System.out.println(plusOne(digits));
    }

    public static ArrayList<Integer> plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 0;
        int lastIndex = digits.length-1;
        int index = digits.length-1;

        if(digits[lastIndex] != 9) {
                digits[index] +=1;
                // return digits;
            }
        
        do {

            if(digits[index] != 9) {
                digits[index] += carry;
                list.add(digits[index]);
                carry = 0;
                Collections.reverse(list);
                // int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
                return list;
            }

            else if(digits[index] == 9 && index != 0) {
                int temp = digits[index];
                digits[index] = temp%10;
                carry = temp/10;
                list.add(digits[index]);

                index --;
            }
            else if(digits[0] == 9) {
                carry = 0;
                list.add(0);
                list.add(1);
                Collections.reverse(list);
            }
        } while(carry != 0);

        return list;

    }
}