package com.cchenxi.leetcode.algorithm.n1;

import java.util.HashMap;
import java.util.Map;

/**
 * 两遍哈希
 *
 * Date: 2020-08-24
 *
 * @author chenxi
 */
public class Solution13 implements TwoSum {
    @Override
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[2];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other) && i != map.get(other)) {
                return new int[]{i, map.get(other)};
            }
        }
        throw new IllegalArgumentException("no solution");
    }
}
