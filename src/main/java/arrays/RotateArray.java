package arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] output = processArray(input, k);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+" ");
        }

    }

    public static int[] processArray(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

        return nums;
    }

    private static void reverse(int[] nums, int left, int right) {
       while (left < right){
           int temp = nums[left];
           nums[left] = nums[right];
           nums[right] = temp;
           left++;
           right--;
       }
    }
}
