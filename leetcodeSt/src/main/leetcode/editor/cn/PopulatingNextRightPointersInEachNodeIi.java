//给定一个二叉树 
//
// 
//struct Node {
//  int val;
//  Node *left;
//  Node *right;
//  Node *next;
//} 
//
// 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。 
//
// 初始状态下，所有 next 指针都被设置为 NULL。 
//
// 
//
// 进阶： 
//
// 
// 你只能使用常量级额外空间。 
// 使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。 
// 
//
// 
//
// 示例： 
//
// 
//
// 
//输入：root = [1,2,3,4,5,null,7]
//输出：[1,#,2,3,#,4,5,7,#]
//解释：给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。序列化输出按层序遍历顺序（由 next 指
//针连接），'#' 表示每层的末尾。 
//
// 
//
// 提示： 
//
// 
// 树中的节点数小于 6000 
// -100 <= node.val <= 100 
// 
//
// 
//
// 
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 链表 二叉树 👍 621 👎 0

  
  package com.shuzijun.leetcode.editor.en;
  public class PopulatingNextRightPointersInEachNodeIi{
      public static void main(String[] args) {
           Solution solution = new PopulatingNextRightPointersInEachNodeIi().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        // 这题与116的区别在于，117是非完全二叉树。但是解题代码是一样的
        Deque<Node> que = new LinkedList<>();

        if(root == null){
            return root;
        }

        que.offer(root);
        while(!que.isEmpty()){
            int levelSize = que.size();

            for(int i = 0; i < levelSize; i++){
                Node node = que.poll();

                // 连接，next指向右侧结点
                if(i < levelSize - 1){
                    node.next = que.peek();
                }else{
                    node.next = null;
                }

                if(node.left !=  null){
                    que.offer(node.left);
                }
                if(node.right != null){
                    que.offer(node.right);
                }
            }
        }
        return root;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }