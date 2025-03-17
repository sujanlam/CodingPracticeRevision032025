package arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(findMaxWaterCollection(height));
    }

    private static int findMaxWaterCollection(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right){
            int width = right-left;
            int ht = Math.min(height[left], height[right]);
            int area = width*ht;
            maxWater = Math.max(area, maxWater);
           if(height[left] < height[right]){
               left++;
           }else {
               right--;
           }
        }
        return maxWater;
    }
}
