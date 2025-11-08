// Letter Combination of Phone Number
import java.util.*;
public class LetterCombination {
    public static void main(String[] args) {
        String up = "12";
        String p = "";
        System.out.println(pad(up, p));
    }
    static List<String> pad(String up, String p) {
        if(up.isEmpty()){
            // System.out.println(p);
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; //Convert '2' to 50 - 48 = 2
        List<String> list = new ArrayList<>();
        for (int i = (digit - 1)*3; i < (digit*3); i++) {
            char ch = (char)('a' + i);
            list.addAll(pad(up.substring(1), p + ch));
        }
        return list;
    }
}