public class SearchInStrings {

    public static void main(String[] args) {
        
        String querry = "Myself Pratyush Mishra, I'm from G.L. Bajaj Institute of Technology and Managment Greater Noida";
        char target = 's';
        String target2 = "I'm";

        System.out.println(search(querry, target));
        System.out.println(search2(querry, target2));

    }

    private static boolean search(String querry, char target) {
        if (querry.length() == 0) {
            return false;
        }
        else {
            for(int i=0; i<querry.length(); i++) {
                if (querry.charAt(i) == target) {
                    return true;
                }
            }
            return false;
        }
    }
    private static boolean search2(String querry, String target2) {
        if (querry.length() == 0) {
            return false;
        }
        else { 
            if(querry.contains(target2)) {
                    return true;
                }
            return false;
        }
    }
}