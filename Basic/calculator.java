import java.util.*;
public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operator from +,-,/,*");
        char c = sc.next().charAt(0);  // Correct way to read a char

        switch (c) {
            case '+' : 
            int sum = a+b;
            System.out.println("THe sum of "+a+" and "+b+" is "+sum);
            break;

            case '-' : 
            int diff = a-b;
            System.out.println("The difference of "+a+" and "+b+" is "+diff);
            break;

            case '*' : 
            int mul = a*b;
            System.out.println("The multiplication of "+a+" and "+b+" is "+mul);
            break;

            case '/' : 
            int div = a/b;
            System.out.println("The division of "+a+" and "+b+" is "+div);
            break;

            default: System.out.println("Invalid operator or operand");
        }
        
        sc.close();
    }
    
}
