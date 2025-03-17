package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,1,4,7,11,3};
        int target = 18;
        int[] res = twoSum(nums, target);
        System.out.println(res[0]+" "+res[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];
            if(mapp.containsKey(comp)){
                return new int[] {mapp.get(comp), i};
            }
            mapp.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
