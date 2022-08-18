//给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：[[3],[9,20],[15,7]]
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
// Related Topics 树 广度优先搜索 二叉树 👍 1428 👎 0

  
  package com.shuzijun.leetcode.editor.en;
  public class BinaryTreeLevelOrderTraversal{
      public static void main(String[] args) {
           Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();
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

    public List<List<Integer>> resList = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        checkFun02(root);
        return resList;

    }
    public void checkFun02(TreeNode node){
        if(node == null) return;
        Queue <TreeNode> que = new LinkedList<TreeNode>();
        que.offer(node);

        while(!que.isEmpty()){
            List<Integer> itemList = new ArrayList<Integer>();
            int len = que.size();

            while(len > 0){
                TreeNode tempNode = que.poll();
                itemList.add(tempNode.val);

                //判断当前结点是否有左右子结点，有的话，按左右顺序加入辅助队列
                if(tempNode.left != null){
                    que.offer(tempNode.left);
                }
                if(tempNode.right != null){
                    que.offer(tempNode.right);
                }
                len--;
            }
            resList.add(itemList);      //将当前层的结点存入resList中
        }

    }


}
//leetcode submit region end(Prohibit modification and deletion)

  }