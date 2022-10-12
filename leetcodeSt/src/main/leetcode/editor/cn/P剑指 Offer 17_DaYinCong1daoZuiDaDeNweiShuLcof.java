//输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。 
//
// 示例 1: 
//
// 输入: n = 1
//输出: [1,2,3,4,5,6,7,8,9]
// 
//
// 
//
// 说明： 
//
// 
// 用返回一个整数列表来代替打印 
// n 为正整数 
// 
//
// Related Topics 数组 数学 👍 259 👎 0

 
package leetcode.editor.cn;
//Java：打印从1到最大的n位数
public class P剑指 Offer 17DaYinCong1daoZuiDaDeNweiShuLcof{
    public static void main(String[] args) {
        Solution solution = new P剑指 Offer 17DaYinCong1daoZuiDaDeNweiShuLcof().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int[] printNumbers(int n) {
        // 简单做法
        int m= (int)Math.pow(10,n);
        int[] a = new int[m-1];
        for(int i=0;i<m-1;i++){
            a[i] = i+1;
        }
        return a;
        // 考虑大数问题
        // 需考虑数字第一位不为0

}
//leetcode submit region end(Prohibit modification and deletion)

}