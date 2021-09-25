package io.github.cchenxi.leetcode.algorithm2.p347;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode-cn.com/problems/top-k-frequent-elements/">347. 前 K 个高频元素</a>
 * Date: 2021-08-22
 *
 * @author chenxi
 */
public class Solution01 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(i -> {
            map.merge(i, 1, Integer::sum);
        });

        // 构造大顶堆
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);

        map.forEach((num, count) -> {
            queue.offer(new int[]{num, count});
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll()[0];
        }

        return result;
    }
}
