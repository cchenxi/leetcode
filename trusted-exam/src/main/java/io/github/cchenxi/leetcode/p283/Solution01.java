package io.github.cchenxi.leetcode.p283;

/**
 * @see <a href="https://leetcode-cn.com/problems/move-zeroes/">移动零</a>
 * Date: 2021-08-04
 *
 * @author chenxi
 */
public class Solution01 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) {
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
