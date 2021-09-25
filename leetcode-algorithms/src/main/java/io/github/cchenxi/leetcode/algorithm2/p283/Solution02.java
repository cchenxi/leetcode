package io.github.cchenxi.leetcode.algorithm2.p283;

/**
 * Date: 2021-08-04
 *
 * @author chenxi
 */
public class Solution02 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        for (int i = 0, j = 0; i < nums.length; i++) {
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
