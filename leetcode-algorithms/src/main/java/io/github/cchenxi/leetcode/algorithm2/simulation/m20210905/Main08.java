package io.github.cchenxi.leetcode.algorithm2.simulation.m20210905;

/**
 * TODO: description
 * Date: 2021-09-05
 *
 * @author chenxi
 */
public class Main08 {
    public int getSum(int a, int b) {
        while (b != 0) {
            int tmp = a ^ b;
            b = (a & b) << 1;
            a = tmp;
        }

        return a;
    }
}
