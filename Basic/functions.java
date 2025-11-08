import java.util.*;
public class functions {

    // Function to call name
    public static void callName ( String name) {
        System.out.println("Your name is : "+name);
        return;
    }

    //Function to add two numbers and return the sum
    public static int add(int a, int b) {
        int sum = a+b;
        System.out.println("Sum of a and b is : "+sum);
        return 0;
    }

    // Function to multiply two numbers
    public static int product(int a, int b) {
        int product = a*b;
        System.out.println("Product of a nad b is :"+product);
        return 0;
    }

    // Function to find factorial of a number
    public static void fact(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial is : "+fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name here : ");
        String name = sc.nextLine();

        callName(name);


        // To add two numbers
        System.out.println("Enter two numbers to find their sum and product :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        add(a, b);
        product(a, b);

        // Factorial
        System.out.println("Enter a positive integer to find its factorial : ");
        int c = sc.nextInt();
        fact(c);


        sc.close();
    }
}
