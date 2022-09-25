//给你一个正整数 n ，生成一个包含 1 到 n² 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：n = 3
//输出：[[1,2,3],[8,9,4],[7,6,5]]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 
//
// Related Topics 数组 矩阵 模拟 👍 821 👎 0

 
package leetcode.editor.cn;
//Java：螺旋矩阵 II
public class P59SpiralMatrixIi{
    public static void main(String[] args) {
        Solution solution = new P59SpiralMatrixIi().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
        int [][] mat = new int [n][n];
        // 左闭右开
        int loop = 0;       // 定义循环次数
        int start = 0;      // 定义每次循环的开始点（start, start）
        int count = 1;      // 定义填充数字
        int i, j;

        while(loop++ < n / 2){      // 判断边界后，loop从1开始
            // 模拟上侧从左至右
            for(j = start; j < n - loop; j++){
                mat[start][j] = count++;
            }
            // 模拟右侧从上到下
            for(i = start; i < n - loop; i++){
                mat[i][j] = count++;
            }
            // 模拟下侧从右至左
            for(; j >= loop; j--){
                mat[i][j] = count++;
            }
            // 模拟左侧从下至上
            for(; i >= loop; i--){
                mat[i][j] = count++;
            }

            start++;
        }
        if(n % 2 == 1){
            mat[n / 2][n / 2] = n * n;
            // mat[start][start] = count;       // 这两行都可以
        }
        return mat;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}