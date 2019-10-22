package com.cchenxi.leetcode.algorithm.p1;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

/**
 * Date: 2019-10-21
 *
 * @author chenxi
 */
public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11,15};
        int target = 9;
        int[] result = twoSum.twoSum3(nums, target);
        System.out.println(JSON.toJSONString(result));
    }
}