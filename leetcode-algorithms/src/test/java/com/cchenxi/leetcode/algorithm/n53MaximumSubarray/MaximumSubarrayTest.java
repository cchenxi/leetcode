package com.cchenxi.leetcode.algorithm.n53MaximumSubarray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-14
 *
 * @author chenxi
 */
public class MaximumSubarrayTest {
    private MaximumSubarray c;

    @Before
    public void setUp() throws Exception {
        c = new MaximumSubarray();
    }

    @Test
    public void maxSubArray() {
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(
                c.maxSubArray(array)
        );
    }
}