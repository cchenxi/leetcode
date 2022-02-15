package io.github.cchenxi.leetcode.algorithm2.p69;

/**
 * <a href="https://leetcode-cn.com/problems/sqrtx/">69. x 的平方根 </a>
 * Date: 2022-02-15
 *
 * @author chenxi
 */
public class Solution01 {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long left = 1;
        long right = x;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) right;
    }

    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
        System.out.println(
                solution01.mySqrt(9)
        );
    }
}
