package io.github.cchenxi.leetcode.algorithm2.p215;

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
    public void findKthLargest() {
        int[] nums = new int[]{3,2,1,5,6,4};
        int result = solution.findKthLargest(nums, 2);
        System.out.println(result);
    }
}