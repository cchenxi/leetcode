package io.github.cchenxi.leetcode.algorithm2.p643;

import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2021-08-29
 *
 * @author chenxi
 */
public class Solution01Test {
    private Solution01 solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution01();
    }

    @Test
    public void findMaxAverage() {
        int[] nums = new int[]{1,12,-5,-6,50,3};
        double result = solution.findMaxAverage(nums, 4);
        System.out.println(result);
    }
}