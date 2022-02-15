package io.github.cchenxi.leetcode.algorithm2.p367;

/**
 * <a href="https://leetcode-cn.com/problems/valid-perfect-square/">367. 有效的完全平方数</a>
 * Date: 2022-02-15
 *
 * @author chenxi
 */
public class Solution01 {
    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long power = mid * mid;
            if (power < num) {
                left = mid + 1;
            } else if (power > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
        System.out.println(
                solution01.isPerfectSquare(16)
        );
    }
}
