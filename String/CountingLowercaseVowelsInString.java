import java.util.Scanner;
public class CountingLowercaseVowelsInString {
    public static void main(String[] args) {
        System.out.println("Enter the String :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int j = 0;

        for(int i=0; i<str.length() ; i++){
            if(str.charAt(i) == 'a'){
                j+=1;
            }
            else if(str.charAt(i) == 'e'){
                j+=1;
            }
            else if(str.charAt(i) == 'i'){
                j+=1;
            }
            else if(str.charAt(i) == 'o'){
                j+=1;
            }
            else if(str.charAt(i) == 'u'){
                j+=1;
            }
        }
        System.out.println(j);
        sc.close();
    }
}
