package io.github.cchenxi.leetcode.p239;

import org.junit.Test;

/**
 * TODO: description
 * Date: 2021-08-22
 *
 * @author chenxi
 */
public class Solution01Test {
    private Solution01 solution = new Solution01();

    @Test
    public void test() {
        System.out.println(
                solution.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)
        );
    }
}