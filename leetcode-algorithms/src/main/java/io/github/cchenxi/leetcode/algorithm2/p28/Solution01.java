package io.github.cchenxi.leetcode.algorithm2.p28;

/**
 * <a href="https://leetcode-cn.com/problems/implement-strstr/">28. 实现 strStr()</a>
 * Date: 2021-09-21
 *
 * @author chenxi
 */
public class Solution01 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (haystack.equals(needle) || needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int end = i + needle.length();
                if (end > haystack.length()) {
                    return -1;
                }
                String ss = haystack.substring(i, end);
                if (needle.equals(ss)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        System.out.println(
                solution.strStr("abc", "c")
        );
    }
}
