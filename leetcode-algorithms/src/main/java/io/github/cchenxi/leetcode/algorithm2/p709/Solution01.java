package io.github.cchenxi.leetcode.algorithm2.p709;

/**
 * 转换成小写字母
 * Date: 2021-08-11
 *
 * @author chenxi
 */
public class Solution01 {
    public String toLowerCase(String s) {
        if (s == null) {
            return "";
        }

        char[] chars = s.toCharArray();

        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                result[i] = (char) (chars[i] + 32);
            } else {
                result[i] = chars[i];
            }
        }

        return new String(result);
    }
}
