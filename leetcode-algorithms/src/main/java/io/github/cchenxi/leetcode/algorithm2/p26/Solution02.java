package io.github.cchenxi.leetcode.algorithm2.p26;

/**
 * Date: 2021-08-05
 *
 * @author chenxi
 */
public class Solution02 {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length < 2) {
            return 1;
        }

        int j = 0;
        // i 可以从1 开始
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }

        return j + 1;
    }
}
