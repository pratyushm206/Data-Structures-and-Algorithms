import java.util.*;

public class practiseSet1 {

    // Function for printing average of three numbers
    public static void avg(int a, int b, int c) {
        int avg = (a+b+c)/3;
        System.out.println("Average of a, b, c is : "+avg);
    }

    // Function to print sum of all odd numbers from a to b
    public static void sumOfOddNumber(int a, int b) {
        if (a>b) {
            System.out.println("The number is not in order , a should be less than b");
            return;
        }
        int sum = 0;
        for(int i=a; i<=b; i++) {

            if (i%2 !=0) {
                sum+=i;
            }
        }
        System.out.println("Sum of all odd numbers from a to b is : "+sum);
    }

    // Function for area and radius of circle

    public static void areaAndCircumference(int r) {
        double area=3.14*r*r;
        double circumference = 2*3.14*r;

        System.out.println("Area of circle for radius "+r+" is : "+area);
        System.out.println("Circumference of circle for radius "+r+" is : "+circumference+"\n");

    }
    
    // Function to Count all +ve, -ve and zeros in an array 

    public static void count(Scanner sc) {
        int[] arr = new int[50];
        int i =0;
        int f;
        int g;
        int n = 0;

        do {
            System.out.println("Enter a number : ");
            f = sc.nextInt();
            arr[i]=f;
            i++;
            n++;

            System.out.println("Do you want to enter another number : 1 for yes , 0 for no ");
            g = sc.nextInt();

        } while (g==1); 

        System.out.println("Input stopped ");

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        for(i=0; i<n; i++) {

            if (arr[i]>0) {
                c1+=1;
            }
    
            else if (arr[i]==0) {
                c2+=1;
            }
    
            else if (arr[i]<0) {
                c3+=1;
            }
        }
        
        System.out.println("Total count of positive numbers are : "+c1);
        System.out.println("Total count of zeroes are : "+c2);
        System.out.println("Total count of negative numbers are : "+c3);

    }
        
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Printing average of three numbers
        avg(a,b,c);

        // Printing sum of all odd numbers from d to e
        System.out.println("Enter two numbers , where second is greater than first");
        int d = sc.nextInt();
        int e = sc.nextInt();

        sumOfOddNumber(d,e);

        // Taking radius as input and returning circumference and area of circle

        System.out.println("Taking a, b and c as radius :");
        areaAndCircumference(a);
        areaAndCircumference(b);
        areaAndCircumference(c);

        // Counting all +ve, -ve and zeros in an array 
        count(sc);

        // Taking two numbers and printing x to the power n
        System.out.println("Enter number x :");
        int x = sc.nextInt();
        System.out.println("Enter the number of power n :");
        int n = sc.nextInt();
        int result = 1;
        for(int i=1; i<=n; i++) {
            result*=x;
        }
        System.out.println("The result of "+x+"^"+n+" is :"+result+"\n");     
        
        sc.close();
    }
}
