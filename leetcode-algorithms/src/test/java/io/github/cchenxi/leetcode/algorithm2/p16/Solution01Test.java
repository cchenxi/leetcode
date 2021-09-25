package io.github.cchenxi.leetcode.algorithm2.p16;

import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2021-08-08
 *
 * @author chenxi
 */
public class Solution01Test {
    private Solution01 solution;
    private int[] nums;
    private int target = 1;

    @Before
    public void setUp() {
        solution = new Solution01();
        nums = new int[]{0, 2, 1, -3};
    }

    @Test
    public void threeSum() {
        System.out.println(
                solution.threeSumClosest(nums, target)
        );
    }
}
