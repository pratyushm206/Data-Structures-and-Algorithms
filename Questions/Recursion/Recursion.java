import java.util.Scanner;
public class Recursion {

    // static void print(int count) {
    //     System.out.println(count);
    //     count++;
    //     print(count);
    // }

    
// Call name 5 times using recursion 
    static void callName(int count) {
        if (count == 6) {
            return;
        }
        System.out.println(count+": Pratyush Mishra");
        count++;
        callName(count);
    }

    // Printing number from 1 to N
    static void printNum(int count1, int n) {
        if (count1==n+1) {
            return;
        }
        System.out.println(count1);
        count1++;
        printNum(count1, n);
    }

    //  Printing from n to 1
    static void printNumReverse(int i ,int n) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        printNumReverse(i-1, n);
    }

    public static void main(String[] args) {

        int count1 = 1;
        // print(count);
        callName(count1);
        System.out.println("Enter the number to count :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(count1, n);
        printNumReverse(n, n);

        sc.close();
    }
}