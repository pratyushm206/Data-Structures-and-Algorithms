// Remove 'a' from the given string of lowercase alphabets and return the remaining string
public class RemoveA {
    public static void main(String[] args) {
        String str = "pratyush mishra";
        String str2 = new String();
        System.out.println(removeFromStr(str, str2, 0));
    }
    static String removeFromStr(String str, String str2 ,int index) {
        if (index == str.length()) {
            return str2;
        }
        if (str.charAt(index) != 'a') {
            str2= str2 + str.charAt(index) ;
        }
        // if (str.charAt(index) == 'a') {
        //     str2 = str2 +"";
        // }
        return removeFromStr(str, str2, index+1);
    }
}
