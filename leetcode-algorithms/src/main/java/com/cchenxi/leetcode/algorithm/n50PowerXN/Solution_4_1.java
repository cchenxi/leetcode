package com.cchenxi.leetcode.algorithm.n50PowerXN;

/**
 * Date: 2020-09-22
 *
 * @author chenxi
 */
public class Solution_4_1 implements PowXXN {
    @Override
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return fastPow(x, n);
    }

    private double fastPow(double x, int n) {
        if (n == 0) {
            return 1d;
        }
        if (n == 1) {
            return x;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
