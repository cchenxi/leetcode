package io.github.cchenxi.leetcode.algorithm2.p246;

/**
 * <a href="https://leetcode-cn.com/problems/strobogrammatic-number/">246. 中心对称数</a>
 * Date: 2021-09-21
 *
 * @author chenxi
 */
public class Solution01 {
    public boolean isStrobogrammatic(String num) {
        if (num.length() < 2) {
            return true;
        }

        int left = 0;
        int right = num.length() - 1;

        while (left < right) {
            if (num.charAt(left) == num.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
