package io.github.cchenxi.leetcode.algorithm1.n1;

/**
 * Date: 2020-08-23
 *
 * @author chenxi
 */
public class Solution11 implements TwoSum {
    @Override
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[2];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no solution");
    }
}
