package com.cchenxi.leetcode.algorithm.n1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * TODO: description
 * Date: 2020-08-23
 *
 * @author chenxi
 */
public class TwoSumTest {
    private int[] nums;
    @Before
    public void setUp() throws Exception {
        nums = new int[]{2, 7, 11, 15, 5};
    }

    @Test
    public void twoSum() {
        TwoSum c = new Solution();
        int[] result = c.twoSum(nums, 9);
        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void twoSum2() {
        TwoSum c = new Solution2();
        int[] result = c.twoSum(nums, 9);
        Assert.assertArrayEquals(new int[]{1, 0}, result);
    }
}