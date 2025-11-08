import java.util.*;
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the characters : ");
        String str = sc.nextLine();
        int n = str.length();
        String revstr = str;

        int l = 0;
        int r = n-1;
        sc.close();

        System.out.println(palindrome(revstr, l, r));
    }

    private static boolean palindrome(String revstr, int l, int r) {
        if (l>r) {
            return true;
        }
        char front = revstr.charAt(l);
        char rear = revstr.charAt(r);
        
        palindrome(revstr, l+1, r=1);

        if (front == rear) {
            l+=1;
            r-=1;
        }
        else{
            return false;
        }
        
        return palindrome(revstr, l+1, r-1);
    }

}