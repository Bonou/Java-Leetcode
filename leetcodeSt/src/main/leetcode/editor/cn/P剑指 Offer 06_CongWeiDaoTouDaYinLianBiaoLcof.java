//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
//
// Related Topics 栈 递归 链表 双指针 👍 339 👎 0

 
package leetcode.editor.cn;
//Java：从尾到头打印链表
public class P剑指 Offer 06CongWeiDaoTouDaYinLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new P剑指 Offer 06CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
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
    public int[] reversePrint(ListNode head) {
//        if(head == null){
//            return new int[0];
//        }
//        ListNode temp = head;
//        int len =0;
//        while(head != null){
//            len++;
//            head = head.next;
//        }
//        int[] res = new int[len];
//        while(temp != null){
//            res[len - 1] = temp.val;
//            temp = temp.next;
//            len--;
//        }
//        return res;
        // 用栈
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] result = new int[size];
        for(int i = 0; i < size; i++){
            result[i] = stack.pop().val;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}