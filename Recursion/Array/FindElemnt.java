// Find all indexes of an target element in an array if not , return -1

import java.util.ArrayList;

public class FindElemnt {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 42, 3, 1,  23, 12, 1, 54, 1, 31};
        int target = 1;
        findValue(arr, target, 0);
        System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(byReturningArrayList(arr, target, 0, list));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findValue(int[] arr, int target, int index) {
        if (index == arr.length) {
            return ;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findValue(arr, target, index+1);
    }


    // By returning arraylist
    static ArrayList<Integer> byReturningArrayList(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
            return byReturningArrayList(arr, target, index+1, list);
        }
        return byReturningArrayList(arr, target, index+1, list);
    }
}




