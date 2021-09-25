package io.github.cchenxi.leetcode.simulation.m20210904;

import java.util.Arrays;

/**
 * Date: 2021-09-04
 *
 * @author chenxi
 */
public class Main03 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int abs = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < abs) {
                    abs = Math.abs(sum - target);
                    result = sum;
                }
                if (sum > target) {
                    while (left < right && nums[right] == nums[--right]);
                } else if (sum < target) {
                    while (left < right && nums[left] == nums[++left]);
                } else {
                    return sum;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main03 main03 = new Main03();
        System.out.println(main03.threeSumClosest(new int[]{-1, 2, 1, 4}, 1));
    }
}
