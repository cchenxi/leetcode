package com.cchenxi.leetcode.algorithm.n189;

import org.junit.Test;

/**
 * Date: 2020-06-27
 *
 * @author chenxi
 */
public class RotateArrayTest {

    @Test
    public void rotate() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 10;
        RotateArray cl = new RotateArray();
        cl.rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}