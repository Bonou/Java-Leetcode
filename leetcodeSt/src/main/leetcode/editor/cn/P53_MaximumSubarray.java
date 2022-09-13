//给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 子数组 是数组中的一个连续部分。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：nums = [5,4,-1,7,8]
//输出：23
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 
//
// 
//
// 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。 
//
// Related Topics 数组 分治 动态规划 👍 5299 👎 0

 
package leetcode.editor.cn;
//Java：最大子数组和
public class P53MaximumSubarray{
    public static void main(String[] args) {
        Solution solution = new P53MaximumSubarray().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        // 局部最优：当前连续和为负数时，立刻放弃，从下一个元素开始重新计算连续和
        if(nums.length == 1){
            return nums[0];
        }
        int sum = Integer.MIN_VALUE;     // 储存连续子数组最大和结果.因为要比较大小，所以先赋值为整型最小值
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            count += nums[i];
            sum = Math.max(sum, count);     // sum维持当前最大值，除非后续有值超过

            if(count <= 0){
                count = 0;      // 重置最大子序列起始位置
            }
        }
        return sum;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}