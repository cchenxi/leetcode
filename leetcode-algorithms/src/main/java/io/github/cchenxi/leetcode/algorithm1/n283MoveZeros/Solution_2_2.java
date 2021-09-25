package io.github.cchenxi.leetcode.algorithm1.n283MoveZeros;

/**
 * Date: 2020-09-01
 *
 * @author chenxi
 */
public class Solution_2_2 implements MoveZero {
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
