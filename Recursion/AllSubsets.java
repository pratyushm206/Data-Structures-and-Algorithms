public class AllSubsets {
    public static void main(String[] args) {
        String unprocessed = "abcde";
        String processed = "";
        subsequence(processed, unprocessed);
    }

    static void subsequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subsequence(processed + ch, unprocessed.substring(1));
        subsequence(processed, unprocessed.substring(1));
    }

}
