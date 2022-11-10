//地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一
//格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但
//它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？ 
//
// 
//
// 示例 1： 
//
// 输入：m = 2, n = 3, k = 1
//输出：3
// 
//
// 示例 2： 
//
// 输入：m = 3, n = 1, k = 0
//输出：1
// 
//
// 提示： 
//
// 
// 1 <= n,m <= 100 
// 0 <= k <= 20 
// 
//
// Related Topics 深度优先搜索 广度优先搜索 动态规划 👍 572 👎 0

 
package leetcode.editor.cn;
//Java：机器人的运动范围
public class P面试题13JiQiRenDeYunDongFanWeiLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题13JiQiRenDeYunDongFanWeiLcof().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int movingCount(int m, int n, int k) {
        // 可简化为只向下或向右搜索
        if(k == 0){
            return 1;
        }
        Queue<int[]> queue = new LinkedList<int[]>();
        int[] dx = {0, 1};
        int[] dy = {1, 0};
        boolean[][] visit = new boolean[m][n];  // 记录是否走过该格子
        queue.offer(new int[]{0,0});
        visit[0][0] = true;
        int count = 1;  // 能够到达的格子数量
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for(int i = 0; i < 2; i++){
                int tx = x + dx[i];
                int ty = y + dy[i];
                // 如果超出范围、该格子访问过 或者 数位之和大于k，则跳过该次循环
                if(tx < 0 || ty < 0 || tx >= m || ty >= n || visit[tx][ty] || getSum(tx) + getSum(ty) > k){
                    continue;
                }
                queue.offer(new int[]{tx, ty});
                visit[tx][ty] = true;
                count++;
            }
        }
        return count;
    }
    private int getSum(int x){
        int res = 0;
//        res = x / 10 + x % 10;
        while(x != 0){
            res += x % 10;
            x /= 10;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}