package io.github.cchenxi.leetcode.algorithm1.n1;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link Solution12} 1表示第一遍刷题 2表示刷题的第n种方法
 * Date: 2020-08-23
 *
 * @author chenxi
 */
public class Solution12 implements TwoSum {
    @Override
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
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
