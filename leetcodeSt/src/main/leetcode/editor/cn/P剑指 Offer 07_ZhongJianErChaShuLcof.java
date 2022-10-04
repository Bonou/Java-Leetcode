//输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。 
//
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 
//
// 
//
// 示例 1: 
// 
// 
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 
//
// 示例 2: 
//
// 
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-
//preorder-and-inorder-traversal/ 
//
// Related Topics 树 数组 哈希表 分治 二叉树 👍 911 👎 0

 
package leetcode.editor.cn;
//Java：重建二叉树
public class P剑指 Offer 07ZhongJianErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new P剑指 Offer 07ZhongJianErChaShuLcof().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        int len = preorder.length;
//        int index;      // 头节点的位置
//        int inoStart;   // inoStart为中序遍历的起点
//        int lenLeft = index - inoStart;
//        // 递归
//        if(preorer == null || inorder == null){
//            return null;
//        }
//        return reTree();
        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);


    }
     TreeNode build(int[] preorder, int[] inorder, int preStart, int preEnd, int inoStart, int inoEnd){
        if(preStart > preEnd || inoStart > inoEnd){
            return null;
        }
        // 树的根节点
        int val = preorder[preStart];
        TreeNode root = new TreeNode(val);
        // 查找根节点在中序遍历的位置
        int index = 0;
        for(int i = inoStart; i <= inoEnd; i++){
            if(inorder[i] == val){
                index = i;
                break;
            }
        }

        // 计算左子树在数组的长度
        int leftSize = index -inoStart;
        // 构建递归
        root.left = build(preorder, inorder, preStart + 1, preStart + leftSize, inoStart, index - 1);
        root.right = build(preorder, inorder, preStart + leftSize + 1, preEnd, index + 1, inoEnd);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}