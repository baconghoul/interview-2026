package 二分查找704;

/**
 * @author liupeipei002@ke.com
 * @date 2025/8/17 17:29
 */
public class peipei {

    /**
     * 思路：
     * 这道题目的前提是数组为有序数组，同时题目还强调数组中无重复元素，
     * 因为一旦有重复元素，使用二分查找法返回的元素下标可能不是唯一的，
     * 这些都是使用二分法的前提条件，当大家看到题目描述满足如上条件的时候，
     * 可要想一想是不是可以用二分法了
     */

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int search = Solution.search(nums, target);
        System.out.println(search);
    }

    static class Solution {
        public static int search(int[] nums, int target) {
            int length = nums.length;
            int left = 0;
            int right = length - 1;
            while (left <= right) {
                // 防止溢出 等同于(left + right)/2
                int mid = left + (right - left) / 2;
                if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }
}
