//给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4]
//输出：[2,1,4,3]
// 
//
// 示例 2： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 100] 内 
// 0 <= Node.val <= 100 
// 
//
// Related Topics 递归 链表 👍 1582 👎 0

 
package leetcode.editor.cn;
//Java：两两交换链表中的节点
public class P24SwapNodesInPairs{
    public static void main(String[] args) {
        Solution solution = new P24SwapNodesInPairs().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
//        // 定义新的虚拟节点，指向头节点
//        ListNode dummyNode = new ListNode(0);
//        dummyNode.next = head;
//        ListNode cur = dummyNode;
//        while(cur.next != null && cur.next.next != null){
//            ListNode temp, temp1;
//            temp = cur.next;
//            temp1 = cur.next.next.next;
//
//            cur.next = cur.next.next;
//            cur.next.next = temp;
//            cur.next.next.next = temp1;
//
//            // cur指向想一次交换的位置前端
//            cur = cur.next.next;
//
//        }
//        return dummyNode.next;

        // 递归
        if(head == null || head.next == null){
            return head;
        }
        ListNode curNext = head.next;
        ListNode newNode = swapPairs(curNext.next);

        curNext.next = head;
        head.next = newNode;

        return curNext;



    }
}
//leetcode submit region end(Prohibit modification and deletion)

}