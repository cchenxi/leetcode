package io.github.cchenxi.leetcode.algorithm2.p239;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode-cn.com/problems/sliding-window-maximum/">239. 滑动窗口最大值</a>
 * Date: 2021-08-22
 *
 * @author chenxi
 */
public class Solution01 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        int[] result = new int[length - k + 1];
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < length; i++) {
            int start = i - k;
            if (start >= 0) {
                queue.remove(nums[start]);
            }
            queue.offer(nums[i]);
            if (queue.size() == k) {
                result[i - k + 1] = queue.peek();
            }
        }

        return result;
    }
}
