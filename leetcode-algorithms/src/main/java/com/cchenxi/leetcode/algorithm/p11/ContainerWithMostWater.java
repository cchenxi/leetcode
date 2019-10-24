package com.cchenxi.leetcode.algorithm.p11;

/**
 * p11
 * Date: 2019-10-24
 *
 * @author chenxi
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max,
                    Math.min(height[left], height[right]) * (right - left)//计算面积
            );
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    /**
     * 暴力计算
     *
     * @param height
     * @return
     */
    public int maxArea2(int[] height) {
        int max = 0;
        for (int left = 0; left < height.length - 1; left++) {
            for (int right = left + 1; right < height.length; right++) {
                max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            }
        }
        return max;
    }
}
