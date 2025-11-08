// Import this function to use input function in java
import java.util.* ;

class hello_world {
    public static void main(String[] args) {
        // In Java, the difference between print and println is in print no new line is added and in println new line is added at the end of the output
        System.out.print("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.print("Hello World\n");


        // Printing a star pattern without any loop
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        

        // Variables
        // String name = "Pratyush Mishra";
        // String my_class = "CSAIML-3";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        System.out.println("Your name is : "+name);

        //Input two numbers and print their sum
        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);



        sc.close();
    }
} 