package shuZu.num704;

/**
 * 704. 二分查找
 *
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果 target 存在返回下标，否则返回 -1。
 *
 * 示例 1:
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 *
 *
 * 【二分查找法】——----------------------------------------------
 * 题目特点： 有序数组，无重复元素。（因为一旦有重复元素，使用二分查找法返回的元素下标可能不是唯一的）
 */
public class wenyue1 {

    class Solution {
        public int search(int[] nums, int target) {

            int left = 0;
            int right = nums.length - 1;
            while(left <= right){

                int mid = left + (right - left) / 2;  //二分查找
                if(nums[mid] > target){
                    right = mid - 1;

                }else if(nums[mid] < target){
                    left = mid + 1;

                }else{
                    return mid;
                }
            }
            return -1;

        }
    }
}
