package 每日一题.top1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangluhan
 * @date 2025/8/12
 * @description
 */
public class eliauk01 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] res = new Solution().twoSum(nums, 9);
        System.out.println("res:[" + res[0] + "," + res[1] + "]");
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            // key:target - nums[i]. value:i
            Map<Integer, Integer> map = new HashMap(nums.length);
            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if (map.containsKey(nums[i])) {
                    return new int[]{map.get(nums[i]), i};
                }
                map.put(diff, i);
            }
            return new int[2];
        }
    }
}
