package io.github.cchenxi.leetcode.p75;

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
    public void sortColors() {
        int[] nums = new int[]{2,0,2,1,1,0, 2};
        solution.sortColors(nums);
        System.out.println(nums);
    }
}