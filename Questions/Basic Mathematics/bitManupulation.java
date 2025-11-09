import java.util.Scanner;

public class bitManupulation {
    public static void main(String[] args) {
        getBit();
        setBit();
        clearBit();
        updateBit();

    }

    // Code for get the bit of any particular position
    public static void getBit() {

        int number = 5;
        int position = 3; //3rd position means 4th bit, position tart from 0
        int bitMask = 1<<position ;
        if ((number & bitMask) ==1) {
            System.out.println("Bit at position "+position+" is : "+1);
        }
        else {
            System.out.println("Bit at position "+position+" is : "+0);
        }
        System.out.println();

    }


    // Code for set bit of any particular number
    public static void setBit() {
        int number = 5;
        int position = 1;
        int bitMask = 1<<position;
        
        int newNumber = (number | bitMask) ;
        System.out.println("New number is : "+newNumber);
        System.out.println();
    }

    // Code for clear bit of any particular position
    public static void clearBit() {
        int number = 5;
        int position = 2;
        int bitMask = 1<<position;
        int notBitMask = ~bitMask;
        int newNumber = notBitMask & number;
        System.out.println("New number is : "+newNumber);
        System.out.println();

    }

    // Code for update bit at a given position
    public static void updateBit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation , 1: Set, 2: CLear");
        int operation = sc.nextInt(); 
        int number = 5;
        int position = 2;
        int bitMask = 1<<position;
        if (operation==1) {
            int newNumber = (number | bitMask) ;
            System.out.println("New number after setting the value to 1: "+newNumber);
        }

        else if (operation==2) {
            int notBitMask = ~bitMask;
            int newNumber = number & notBitMask ;
            System.out.println("New number after setting the value to 0 :"+newNumber);
        }

        else {
            System.out.println("Invalid input");
        }
        System.out.println();

        sc.close();
    }

}