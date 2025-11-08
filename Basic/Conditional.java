import java.util.*;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You are eligible for vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }

        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a<b) {
            System.out.println(a+" is less than "+b);
        }
        else if (a==b) {
            System.out.println(a+" is equal to "+b);
        }
        else {
            System.out.println(a+" is greater than "+b);
        }

        System.out.println("Enter a number from 1 to 3");
        int button = sc.nextInt();
        switch (button) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default : System.out.println("Unvalid button");
        }

        sc.close();
    }

    
    
}
