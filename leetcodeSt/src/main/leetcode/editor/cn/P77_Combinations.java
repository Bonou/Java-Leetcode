//给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。 
//
// 你可以按 任何顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4, k = 2
//输出：
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
//
// 示例 2： 
//
// 
//输入：n = 1, k = 1
//输出：[[1]] 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
//
// Related Topics 回溯 👍 1178 👎 0

 
package leetcode.editor.cn;
//Java：组合
public class P77Combinations{
    public static void main(String[] args) {
        Solution solution = new P77Combinations().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return result;
    }

    private void backtracking(int n, int k, int index){
        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i <= n -(k -path.size()) + 1; i++){
            path.add(i);
            backtracking(n, k, i+1);
            path.removeLast();  // ArrayList 动态数组没有removeLast()这个方法，所以得用LinkedList

        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}