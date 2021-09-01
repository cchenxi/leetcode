package io.github.cchenxi.leetcode.p215;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode-cn.com/problems/kth-largest-element-in-an-array/">215. 数组中的第K个最大元素</a>
 * Date: 2021-08-29
 *
 * @author chenxi
 */
public class Solution01 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            queue.offer(num);
        }

        int result = 0;
        for (int i = 0; i < k; i++) {
            result = queue.poll();
        }

        return result;
    }
}
