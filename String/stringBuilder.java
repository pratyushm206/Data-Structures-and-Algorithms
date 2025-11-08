// import java.util.*;
public class stringBuilder {
    
    public static void main(String[] args) {
        // String Builder
        StringBuilder sb = new StringBuilder("Pony");
        System.out.println(sb);

        // Set character at any given index.
        sb.setCharAt(0, 'T');
        System.out.println(sb);

        // Insert a character at any given index
        sb.insert(2,'n');
        System.out.println(sb);

        // Delete a substring (End value is not count) deletion will be start to (end-1)
        sb.delete(2, 4);
        System.out.println(sb);

        // Append in a string
        StringBuilder str1 = new StringBuilder("He");
        str1.append('l');
        str1.append('l');
        str1.append('o');
        System.out.println(str1);
    }
}
 