package com.cchenxi.leetcode.algorithm.n15ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * hash
 * 超时了 ;(
 * Date: 2020-09-05
 *
 * @author chenxi
 */
public class Solution_2_1 implements ThreeSum_ {
    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }
//        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> result = new LinkedHashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                int other = target - nums[j];
                Integer exist = map.get(other);
                if (exist != null) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], exist);
                    list.sort(Comparator.naturalOrder());
                    result.add(list);
                } else {
                    map.put(nums[j], nums[j]);
                }
            }
        }
        return new ArrayList<>(result);
    }
}
