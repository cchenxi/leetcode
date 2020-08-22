package com.cchenxi.leetcode.algorithm.n344ReverseString;

/**
 * Date: 2019-10-31
 *
 * @author chenxi
 */
public class ReverseString {
    public void reverseString(char[] s) {
        m2(s);
    }

    private void m2(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }

    public void m1(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        for (int i = 0; i < s.length / 2; i++) {
            int j = s.length - i - 1;

            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }


}
