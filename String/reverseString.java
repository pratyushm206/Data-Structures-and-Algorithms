import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to get its reverse order :");
        StringBuilder str = new StringBuilder(sc.nextLine());
        int n = str.length();

        for(int i=0; i<n/2; i++) {
            int front = i;
            int rear = n-1-i;

            char frontchar = str.charAt(front);
            char rearchar = str.charAt(rear);

            str.setCharAt(front, rearchar);
            str.setCharAt(rear, frontchar);

        }
        System.out.println(str);

        sc.close();
    }
}
