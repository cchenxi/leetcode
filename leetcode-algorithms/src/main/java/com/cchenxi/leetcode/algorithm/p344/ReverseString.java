package com.cchenxi.leetcode.algorithm.p344;

/**
 * Date: 2019-10-31
 *
 * @author chenxi
 */
public class ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            int j = s.length - i - 1;

            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }
}
