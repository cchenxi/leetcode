package io.github.cchenxi.leetcode.algorithm1.n709ToLowerCase;

/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: "Hello"
 * 输出: "hello"
 * 示例 2：
 *
 * 输入: "here"
 * 输出: "here"
 * 示例 3：
 *
 * 输入: "LOVELY"
 * 输出: "lovely"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/to-lower-case
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * Date: 2020-08-22
 *
 * @author chenxi
 */
public class ToLowerCase {
    public String toLowerCase(String str) {
        return m2(str);
    }

    private String m1(String str) {
        if (str == null || "".equals(str)) {
            return str;
        }

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(chars[i])) {
                sb.append(Character.toLowerCase(chars[i]));
            } else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }

    private String m2(String str) {
        if (str == null || "".equals(str)) {
            return str;
        }

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <=90) {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }

}
