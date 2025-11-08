import java.util.*;
public class array1D {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 87 ;
        marks[1] = 97 ; 
        marks[2] = 86 ;
        marks[3] = 88 ;
        System.out.println(marks); // This will not print hte actual marks rather it will print the address of marks. 
        
        for(int i = 0; i<5; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("Student height");
        int age[] = {231, 232, 123, 323, 432, 532, 213};
        System.out.println("Height of students: ");
        for(int i=0; i<7; i++) {
            System.out.println("Height of student "+(i+1)+" is "+age[i]);
        }
        System.out.println();

        // Taking an array as input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        boolean found = false;

        for(int i=0; i<n; i++) {
            System.out.print("Enter the "+i+" element : ");
            int element = sc.nextInt();
            array[i] = element;
        }

        System.out.println("Your enterred array is : ");
        for(int i=0; i<n; i++) {
            System.out.print(array[i]+", ");
        }

        System.out.println("\nEnter the element to search in the array : ");
        int search = sc.nextInt();

        for(int i=0; i<n; i++) {
            if (search == array[i]) {
                found = true;
                System.out.println("element "+search+" is at index "+i);
            }   
            
            if (!found) {
                System.out.println("element "+search+" is not found in the array. ");
            }
        }
        sc.close();
        
    }

}