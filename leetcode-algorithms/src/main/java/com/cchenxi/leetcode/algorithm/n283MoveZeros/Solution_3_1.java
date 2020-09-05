package com.cchenxi.leetcode.algorithm.n283MoveZeros;

/**
 * Date: 2020-09-05
 *
 * @author chenxi
 */
public class Solution_3_1 implements MoveZero {
    @Override
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
