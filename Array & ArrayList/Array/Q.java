import java.util.*;
class Solution {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        
        System.out.println(lastStoneWeight(stones));
    }
    public static int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int stone : stones) {
            list.add(stone);
        }
        Collections.sort(list);

        while (list.size() > 1) {
            Collections.sort(list); // Sort in ascending order

            int n = list.size();
            int y = list.remove(n - 1); // Heaviest
            int x = list.remove(n - 2); // Second heaviest

            if (x != y) {
                list.add(y - x);
            }
        }
        return list.get(0);
    }
}

