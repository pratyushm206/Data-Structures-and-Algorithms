public class DuplicteElements {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3,1,4,1,5,6,2};
        System.out.println(answer(arr));
    }
    public static int answer(int[] arr) {
        int unique = 0;
        for(int n : arr) {
            unique^=n;
            System.out.println(unique);
        }
        return unique;
    }
}
