import java.util.*;

public class string {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name :");
        String fullName = sc.nextLine();
        System.out.println("Size of above string is : "+fullName.length());
        System.out.println("Your name is : "+fullName);
        System.out.println("Enter your complete address :");
        String address = sc.nextLine();
        System.out.println("Your address is : "+address);
        System.out.println("Size of above string is : "+address.length());
        System.out.println();

        // Concatenation
        String detail = fullName +"\n" + address ;
        System.out.println("\nYour complete detail is : "+detail);
        // Length of a string
        System.out.println("\nSize of above string is : "+detail.length());
        System.out.println("The alphabet at index 3 is :"+address.charAt(3));

        // Comparison
        String str1 = "aaahello";
        String str2 = "aaawello";

        if (str1==str2) {
            System.out.println("Equal string");
        }
        else {
            System.out.println("Strings are not equal");
        }
    
        // Substring

        String sentence = "My name is Pratyush Mishra";
        String firstName = sentence.substring(11, 19);
        System.out.println(firstName);
        String name = sentence.substring(11);
        System.out.println(name);

        sc.close();
    }



}
