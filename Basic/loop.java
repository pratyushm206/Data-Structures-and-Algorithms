import java.util.*;
public class loop {
    public static void main(String[] args) {

        for(int i = 0; i<10; i++) {
            System.out.println("Number is "+i);
        }

        int j = 0;
        while (j<20) {
            System.out.println("Hii the number is "+j);
            j++;
        }

        int k = -1;
        do {
            System.out.println("Hello the condition will execuute first time even if condition is false");
        }
        while(k>0); // dont miss the semicolon
        // do while loop is use for password , we first enter the password once then it executes and if error occours then it will not executes second tiem
        
        //Sum of first n natural numbers

        System.out.println("Enter a  natural number to find sum of 0 to that number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;

        do {
            sum += count;
            count++;
        } while(count<=n);
        System.out.println("Sum of 0 to "+n+ " is "+sum);

        sc.close();
    }
}