import java.util.*;
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2}, {2,6}, {0,10},{15,16}};
        System.out.println(merge(intervals));
    }

    public static ArrayList<ArrayList<Integer>> merge(int[][] intervals) {
        int[] arr = new int[10001];
        for(int[] elements : intervals){
            int start = elements[0];
            int end = elements[1];
            for(int i = start; i<= end; i++){
                arr[i] += 1;
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int start = 0;
        int end = -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] == 0 && arr[i] != 0){
                start = i;
            }
            else if(arr[i] != 0 && arr[i+1] == 0){
                end = i;
                ArrayList<Integer> group = new ArrayList<>();
                group.add(start);
                group.add(end);
                ans.add(group);
            }
        }
        return ans;
    }
}
