package com.cchenxi.leetcode.algorithm.n1;

import java.util.HashMap;
import java.util.Map;

/**
 * 一遍哈希
 * Date: 2020-09-01
 *
 * @author chenxi
 */
public class Solution_2_1 implements TwoSum {
    @Override
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[2];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other)) {
                return new int[]{i, map.get(other)};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("no solution");
    }
}
