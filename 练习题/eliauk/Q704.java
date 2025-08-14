package 练习题.eliauk;

/**
 * @author wangluhan
 * @date 2025/8/14
 * @description
 */
public class Q704 {

    // Q704 二分查找

    class Solution {
        public int search(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (nums[mid] == target) {
                    return mid;
                }
                if (nums[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }
    }
}
