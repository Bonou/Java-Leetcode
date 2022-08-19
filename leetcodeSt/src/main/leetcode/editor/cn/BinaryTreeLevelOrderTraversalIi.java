//给你二叉树的根节点 root ，返回其节点值 自底向上的层序遍历 。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历） 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：[[15,7],[9,20],[3]]
// 
//
// 示例 2： 
//
// 
//输入：root = [1]
//输出：[[1]]
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 2000] 内 
// -1000 <= Node.val <= 1000 
// 
//
// Related Topics 树 广度优先搜索 二叉树 👍 608 👎 0

  
  package com.shuzijun.leetcode.editor.en;
  public class BinaryTreeLevelOrderTraversalIi{
      public static void main(String[] args) {
           Solution solution = new BinaryTreeLevelOrderTraversalIi().new Solution();
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
     * 解法：队列，迭代。
     * 层序遍历，再翻转数组即可。
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        //Deque Java中队列，通过LinkedList来实现
        Deque<TreeNode> que = new LinkedList<>();

        if(root == null){
            return list;
        }

        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> levelList = new ArrayList<>();    //用来临时储存每一层上结点

            int levelSize = que.size();
            for(int i = 0; i< levelSize; i++){
                TreeNode peek = que.peekFirst();
                levelList.add(que.pollFirst().val);

                //左右叶子节点
                if(peek.left != null){
                    que.offerLast(peek.left);
                }
                if(peek.right != null){
                    que.offerLast(peek.right);
                }
            }
            list.add(levelList);
        }

        List<List<Integer>> result = new ArrayList<>();
        //将list二维数组的第一层翻转
        for(int i = list.size() - 1; i >= 0; i--){
            result.add(list.get(i));
        }
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }