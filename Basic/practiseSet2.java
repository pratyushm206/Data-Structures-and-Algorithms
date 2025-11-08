import java.util.*;
public class practiseSet2 {

    // Function for Greatest common divisor  

    public static void findGCD() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their GCD : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1 ;

        int min = (a < b) ? a : b;

        for(int i=1; i<=min; i++) {
            if (a%i==0 && b%i==0) {
                gcd = i;      
            }
        }
        System.out.println("The GCD is : "+gcd);

        sc.close();
    }

    // Function to print fibonacci series

    public static void fibonacci() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci series is : ");
        for(int i=1; i<=n; i++) {
            System.out.print(first+" ");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Greatest common divisor
        findGCD();
        System.out.println();

        // Fibonacci series 
        fibonacci();


        sc.close();
    }
    
    
}
