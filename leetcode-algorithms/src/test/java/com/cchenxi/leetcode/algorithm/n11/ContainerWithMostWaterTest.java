package com.cchenxi.leetcode.algorithm.n11;

import org.junit.Test;

/**
 * Date: 2020-06-26
 *
 * @author chenxi
 */
public class ContainerWithMostWaterTest {

    @Test
    public void maxArea() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        ContainerWithMostWater c = new ContainerWithMostWater();
        int maxArea = c.maxArea(height);
        System.out.println(maxArea);
    }
}