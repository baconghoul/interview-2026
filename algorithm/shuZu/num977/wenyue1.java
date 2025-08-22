package shuZu.num977;

/**
 * 977. 有序数组的平方
 *
 * 给你一个按 非递减顺序 排列的整数数组 nums，返回每个数字的平方组成的新数组，
 * 该数组也应该按 非递减顺序 排列。
 *
 * 示例 1：
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 *
 *
 * 【双指针法】——----------------------------------------------
 */
public class wenyue1 {
    public static void main(String[] args) {

        int[] res = sortedSquares(new int[]{-4,-1,0,3,10});
        for (int i : res) {
            System.out.print(i + " ");
        }

    }
    public static  int[] sortedSquares(int[] nums) {

        int l = 0;
        int r = nums.length - 1;
        int[] res = new int[nums.length];
        int t = nums.length - 1;
        while(l <= r){

            if(nums[l]*nums[l] < nums[r]*nums[r]){
                res[t] =  nums[r]*nums[r];
                r--;

            }else{
                res[t] = nums[l]*nums[l];
                l++;

            }
            t--;
        }
        return res;
    }

}
