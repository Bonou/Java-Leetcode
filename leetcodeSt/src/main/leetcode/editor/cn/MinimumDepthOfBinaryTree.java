//给定一个二叉树，找出其最小深度。 
//
// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。 
//
// 说明：叶子节点是指没有子节点的节点。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：root = [2,null,3,null,4,null,5,null,6]
//输出：5
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数的范围在 [0, 10⁵] 内 
// -1000 <= Node.val <= 1000 
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 820 👎 0

  
  package com.shuzijun.leetcode.editor.en;
  public class MinimumDepthOfBinaryTree{
      public static void main(String[] args) {
           Solution solution = new MinimumDepthOfBinaryTree().new Solution();
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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        if (root == null){
            return 0;
        }
        que.offer(root);
        int minDepth = 0;
        while (!que.isEmpty())
        {
            int len = que.size();
            minDepth++;
            while (len > 0)
            {
                TreeNode node = que.poll();
                if (node.left != null){
                    que.offer(node.left);
                }
                if (node.right != null){
                    que.offer(node.right);
                }

                //如果当前节点的左右孩子都为空，返回最小深度
                if(node.left == null && node.right == null){
                    return minDepth;
                }
                len--;
            }
        }
        return minDepth;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }