import java.util.ArrayList;

public class ReturnSubsetsInList {

    public static void main(String[] args) {
        String unprocessed = "abc";
        
        String processed = "";
        System.out.println(subsequence(processed, unprocessed));
    }
    
    static ArrayList<String> subsequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> left = subsequence(processed + ch, unprocessed.substring(1));
        ArrayList<String> right = subsequence(processed, unprocessed.substring(1));
        
        left.addAll(right);

        return left;
    }
}
