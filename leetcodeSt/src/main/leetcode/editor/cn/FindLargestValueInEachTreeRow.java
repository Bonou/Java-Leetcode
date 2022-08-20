//给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。 
//
// 
//
// 示例1： 
//
// 
//
// 
//输入: root = [1,3,2,5,3,null,9]
//输出: [1,3,9]
// 
//
// 示例2： 
//
// 
//输入: root = [1,2,3]
//输出: [1,3]
// 
//
// 
//
// 提示： 
//
// 
// 二叉树的节点个数的范围是 [0,10⁴] 
// 
// -2³¹ <= Node.val <= 2³¹ - 1 
// 
//
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 272 👎 0

  
  package com.shuzijun.leetcode.editor.en;
  public class FindLargestValueInEachTreeRow{
      public static void main(String[] args) {
           Solution solution = new FindLargestValueInEachTreeRow().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    /**
     *
     * @param root
     * 先层序遍历，令max的初值为integer中最小值，即Integer.MIN_VALUE,然后将每一层中的结点数与max比较，取最大值
     * @return
     */
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> que = new LinkedList<>();

        if(root == null){
            return list;
        }

        que.offer(root);
        while(!que.isEmpty()){
            int levelSize = que.size();
            int max = Integer.MIN_VALUE;   // 令max初值为Integer中最小值

            for(int i = 0; i < levelSize; i++){
                TreeNode node = que.poll();
                max = Math.max(max, node.val);
                if(node.left != null){
                    que.offer(node.left);
                }
                if(node.right != null){
                    que.offer(node.right);
                }
            }
            list.add(max);  // 将该层最大值存入list
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }