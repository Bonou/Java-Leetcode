//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。 
//
// 示例1： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4 
//
// 限制： 
//
// 0 <= 链表长度 <= 1000 
//
// 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/ 
//
// Related Topics 递归 链表 👍 282 👎 0

 
package leetcode.editor.cn;
//Java：合并两个排序的链表
public class P剑指 Offer 25HeBingLiangGePaiXuDeLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new P剑指 Offer 25HeBingLiangGePaiXuDeLianBiaoLcof().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        // 取l1、l2共同的长度部分比较大小
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                pre.next = l1;
                pre = l1;
                l1 = l1.next;
            }else{
                pre.next = l2;
                pre = l2;
                l2 = l2.next;
            }

        }
        // 剩下l1的部分
        if(l1 != null){
            pre.next = l1;
        }
        // 剩下l2的部分
        if(l2 != null){
            pre.next = l2;
        }
        return dummy.next;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}