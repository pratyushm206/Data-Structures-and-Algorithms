import java.util.*;
public class StringArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.next();
        }
        sc.close();
    }
}