public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        
        char[] arr = {'c', 'd', 'f','i', 'j', 'm', 'o', 'p', 'q', 'r', 'w',};
        char target = 'a';
        int li =0;
        int ei = arr.length-1;

        System.out.println(helper(arr, target, li, ei));
        
    }

    private static char helper(char[] arr, char target, int li, int ei) {
        if (li > ei) {
            return arr[li % arr.length];
        }
        
        int mid = li + (ei-li) / 2;

        if(arr[mid] > target) {
            return helper(arr, target, li, mid-1);
        }

        else {
            return helper(arr, target, mid+1, ei);
        }
    }
}