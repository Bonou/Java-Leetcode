//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
//
// Related Topics 字符串 👍 354 👎 0

 
package leetcode.editor.cn;
//Java：替换空格
public class P剑指 Offer 05TiHuanKongGeLcof{
    public static void main(String[] args) {
        Solution solution = new P剑指 Offer 05TiHuanKongGeLcof().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        int len = s.length();
        StringBuilder s1 = new StringBuilder(len);
        for(int i = 0; i < len; i++){
            if(s.charAt(i) != ' '){
                s1.append(s.charAt(i));
            }else{
                s1.append("%20");
            }
        }
        return s1.toString();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}