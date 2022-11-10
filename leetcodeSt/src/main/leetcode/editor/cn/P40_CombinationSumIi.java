//给定一个候选人编号的集合 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。 
//
// candidates 中的每个数字在每个组合中只能使用 一次 。 
//
// 注意：解集不能包含重复的组合。 
//
// 
//
// 示例 1: 
//
// 
//输入: candidates = [10,1,2,7,6,1,5], target = 8,
//输出:
//[
//[1,1,6],
//[1,2,5],
//[1,7],
//[2,6]
//] 
//
// 示例 2: 
//
// 
//输入: candidates = [2,5,2,1,2], target = 5,
//输出:
//[
//[1,2,2],
//[5]
//] 
//
// 
//
// 提示: 
//
// 
// 1 <= candidates.length <= 100 
// 1 <= candidates[i] <= 50 
// 1 <= target <= 30 
// 
//
// Related Topics 数组 回溯 👍 1146 👎 0

 
package leetcode.editor.cn;
//Java：组合总和 II
public class P40CombinationSumIi{
    public static void main(String[] args) {
        Solution solution = new P40CombinationSumIi().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        int sum = 0;
        boolean[] used;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        used = new boolean[candidates.length];
        Arrays.fill(used, false);
        Arrays.sort(candidates);
        backtracking(candidates, target, 0);
        return result;
    }

    private void backtracking(int[] candidates, int target,int index){
        if(sum == target){
            result.add(new ArrayList<>(path));
        }
        for(int i = index; i <= candidates.length - 1; i++){
            if(candidates[i] + sum > target){
                break;
            }
            if(i > 0 && !used[i - 1]  && candidates[i] == candidates[i - 1]){  // 跳过重复节点
                continue;
            }
            used[i] = true;
            sum += candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, target,i+1);
            used[i] = false;
            sum -=candidates[i];
            path.removeLast();

        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}