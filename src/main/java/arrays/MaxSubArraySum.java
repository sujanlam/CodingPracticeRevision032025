package arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max((nums[i] + sum), nums[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
