package io.github.cchenxi.leetcode.algorithm2.p11;

/**
 * @see <a href="https://leetcode-cn.com/problems/container-with-most-water/">盛最多水的容器</a>
 * Date: 2021-08-04
 *
 * @author chenxi
 */
public class Solution01 {
    public int maxArea(int[] height) {
        // 异常处理
        if (height == null || height.length < 2) {
            return 0;
        }

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // 面积计算
            int area = Math.min(height[left], height[right]) * (right - left);
            if (area > maxArea) {
                maxArea = area;
            }

            // 将高度小的那一边向前移动，才有可能获得高于现有值
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
