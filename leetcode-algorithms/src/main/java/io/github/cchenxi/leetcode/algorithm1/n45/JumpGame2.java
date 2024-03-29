package io.github.cchenxi.leetcode.algorithm1.n45;

/**
 * TODO: description
 * Date: 2020-07-26
 *
 * @author chenxi
 */
public class JumpGame2 {

    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
