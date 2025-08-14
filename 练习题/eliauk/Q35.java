package 练习题.eliauk;

/**
 * @author wangluhan
 * @date 2025/8/14
 * @description
 */
public class Q35 {

    // 搜索插入位置

    class Solution {
        public int searchInsert(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            while (low < high) {
                int mid = (low + high) / 2;
                if(nums[mid] == target) {
                    return mid;
                }
                if (nums[mid] > target) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            return nums[low] >= target ? low : low + 1;
        }
    }
}
