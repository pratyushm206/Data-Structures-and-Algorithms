public class Permutatins {
    public static void main(String[] args) {
        String unprocessed = "abc";
        permutation(unprocessed, " ");
    }

    static void permutation(String unprocessed, String processed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0,i);
            String s = processed.substring(i, processed.length());

            permutation(unprocessed.substring(1), f + ch + s);
        }
    }
}
