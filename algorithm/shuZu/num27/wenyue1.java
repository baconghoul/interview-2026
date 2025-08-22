package shuZu.num27;
/**
 * 27. 移除元素
 *
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。
 * 然后返回 nums 中与 val 不同的元素的数量。
 *
 示例 2：
 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 输出：5, nums = [0,1,4,0,3,_,_,_]
 解释：你的函数应该返回 k = 5，并且 nums 中的前五个元素为 0,0,1,3,4。
 *
 *
 * 【快慢指针法】——----------------------------------------------
 *  通过一个快指针和慢指针在一个for循环下完成两个for循环的工作。
 *  当快指针指向元素值  != 目标值，慢指针前移动
 */
public class wenyue1 {
    public int removeElement(int[] nums, int val) {

        int slow = 0;
        for(int fast = 0; fast < nums.length; fast++){

            if(nums[fast] != val){ //当快指针指向元素值  != 目标值，慢指针前移动
                nums[slow] = nums[fast];
                slow++;

            }
        }
        return slow;

    }
}
