package 两数之和;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author liupeipei002@ke.com
 * @date 2025/8/5 14:48
 */
public class peipei01 {

    // todo: 第一题
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        // int[] res = new Solution().twoSum(nums, 9);
        int[] res = new Solution1().twoSum(nums, 9);
        System.out.println("res:[" + res[0] + "," + res[1] + "]");
    }

    // 两数之和
    static class Solution01 {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];

        }
    }


    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            Map<Integer, Integer> numToIndex = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                numToIndex.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                Integer diffIndex = numToIndex.get(diff);
                if (Objects.nonNull(diffIndex)) {
                    res[0] = i;
                    res[1] = diffIndex;
                    return res;
                }
            }
            return res;
        }
    }

    static class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            Map<Integer, Integer> numToIndex = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if (numToIndex.containsKey(diff)) {
                    return new int[] {numToIndex.get(diff), i};
                }
                numToIndex.put(nums[i], i);
            }
            return res;
        }
    }
}
