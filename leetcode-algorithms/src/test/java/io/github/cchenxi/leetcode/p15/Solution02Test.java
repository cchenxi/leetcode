package io.github.cchenxi.leetcode.p15;

import org.junit.Before;
import org.junit.Test;

/**
 * TODO: description
 * Date: 2021-08-08
 *
 * @author chenxi
 */
public class Solution02Test {
    private Solution01 solution;
    private int[] nums;

    @Before
    public void setUp() {
        solution = new Solution01();
        nums = new int[]{-1,0,1,2,-1,-4};
    }

    @Test
    public void threeSum() {
        System.out.println(
                solution.threeSum(nums)
        );
    }
}
