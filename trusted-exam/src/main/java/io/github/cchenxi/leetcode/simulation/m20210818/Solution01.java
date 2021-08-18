package io.github.cchenxi.leetcode.simulation.m20210818;

/**
 * Date: 2021-08-18
 *
 * @author chenxi
 */
public class Solution01 {
    public void reverseString(char[] s) {
        if (s == null || s.length < 2) {
            return;
        }

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
