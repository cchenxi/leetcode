package io.github.cchenxi.leetcode.algorithm2.p323;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://leetcode-cn.com/problems/number-of-connected-components-in-an-undirected-graph/">323. 无向图中连通分量的数目</a>
 * Date: 2022-02-13
 *
 * @author chenxi
 */
public class Solution01 {
    public int countComponents(int n, int[][] edges) {
        int count = 0;
        List<List<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            count++;
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            while (!queue.isEmpty()) {
                int index = queue.poll();
                visited[index] = true;
                for (Integer next : list.get(index)) {
                    if (!visited[next]) {
                        queue.offer(next);
                    }
                }
            }
        }

        return count;
    }
}
