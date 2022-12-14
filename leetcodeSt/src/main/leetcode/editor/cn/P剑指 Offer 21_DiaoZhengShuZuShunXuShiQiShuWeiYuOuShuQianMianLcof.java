//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。 
//
// 
//
// 示例： 
//
// 
//输入：nums = [1,2,3,4]
//输出：[1,3,2,4] 
//注：[3,1,2,4] 也是正确的答案之一。 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 50000 
// 0 <= nums[i] <= 10000 
// 
//
// Related Topics 数组 双指针 排序 👍 263 👎 0

 
package leetcode.editor.cn;
//Java：调整数组顺序使奇数位于偶数前面
public class P剑指 Offer 21DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof{
    public static void main(String[] args) {
        Solution solution = new P剑指 Offer 21DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] exchange(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[n];
//        int left = 0, right = n - 1;
//        for (int num : nums) {
//            if (num % 2 == 0) {
//                ans[right--] = num;
//            } else {
//                ans[left++] = num;
//            }
//        }
//        return ans;
        int n =nums.length;
        int left = 0;
        int right = n - 1;
        while(left < right){
            if(nums[left] % 2 == 0 && nums[right] % 2 == 1){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }else if(nums[left] % 2 == 1){
                left++;
            }else if(nums[right] % 2 == 0){
                right--;
            }
        }
        return nums;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}