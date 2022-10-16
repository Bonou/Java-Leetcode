//请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。 
//
// 数值（按顺序）可以分成以下几个部分： 
//
// 
// 若干空格 
// 一个 小数 或者 整数 
// （可选）一个 'e' 或 'E' ，后面跟着一个 整数 
// 若干空格 
// 
//
// 小数（按顺序）可以分成以下几个部分： 
//
// 
// （可选）一个符号字符（'+' 或 '-'） 
// 下述格式之一： 
// 
// 至少一位数字，后面跟着一个点 '.' 
// 至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字 
// 一个点 '.' ，后面跟着至少一位数字 
// 
// 
//
// 整数（按顺序）可以分成以下几个部分： 
//
// 
// （可选）一个符号字符（'+' 或 '-'） 
// 至少一位数字 
// 
//
// 部分数值列举如下： 
//
// 
// ["+100", "5e2", "-123", "3.1416", "-1E-16", "0123"] 
// 
//
// 部分非数值列举如下： 
//
// 
// ["12e", "1a3.14", "1.2.3", "+-5", "12e+5.4"] 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "0"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "e"
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：s = "."
//输出：false 
//
// 示例 4： 
//
// 
//输入：s = "    .1  "
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 20 
// s 仅含英文字母（大写和小写），数字（0-9），加号 '+' ，减号 '-' ，空格 ' ' 或者点 '.' 。 
// 
//
// Related Topics 字符串 👍 396 👎 0

 
package leetcode.editor.cn;
//Java：表示数值的字符串
public class P剑指 Offer 20BiaoShiShuZhiDeZiFuChuanLcof{
    public static void main(String[] args) {
        Solution solution = new P剑指 Offer 20BiaoShiShuZhiDeZiFuChuanLcof().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isNumber(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        // 去掉头尾的空格
        s = s.trim();
        boolean dotFlag = false;
        boolean numFlag = false;
        boolean eFlag = false;
        for(int i = 0; i < s.length(); i++){
            // 判定为数字，则标记numFlag为true
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                numFlag = true;
                // 判定出现'.'，且首次出现，并且在'.'之前没出现过e
            }else if(s.charAt(i) == '.' && !dotFlag && !eFlag){
                dotFlag = true;
                // 判断e，之前没出现过e，且出现过数字
            }else if((s.charAt(i) == 'e' || s.charAt(i) == 'E') && !eFlag && numFlag){
                eFlag = true;
                numFlag = false;     // 避免出现0E，需要在e后面再次出现数字,所以将numFlag再次赋为false
                // 判定+-，只能出现在字符串首位或者在e后面一位
            }else if((s.charAt(i) == '+' || s.charAt(i) == '-') && (i == 0 || s.charAt(i - 1) =='E' || s.charAt(i - 1) == 'e')){

            }else{
                // 其他情况都不正确
                return false;
            }
        }
        return numFlag;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}