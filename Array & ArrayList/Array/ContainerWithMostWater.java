public class ContainerWithMostWater {

    public static void main(String[] args) {
       int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    //    int li = 0;
    //    int ei = height[height.length-1];
       int area = 0;
       int maxWater = 0;

       for(int i =0; i< height.length-1 ; i++) {
        for(int j = i+1; j< height.length ; j++) {
        
            if (height[i] <= height[j]) {
                area = height[i]*(j-i);

                }
            else if(height[i] > height[j]) {
                area = height[j]*(j-i);
            }
            if(maxWater <= area) {
                maxWater = area;
            }
        }
       }
       System.out.println(maxWater);
    }
}