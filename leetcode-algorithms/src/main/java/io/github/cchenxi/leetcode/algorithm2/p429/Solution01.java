package io.github.cchenxi.leetcode.algorithm2.p429;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @see <a href="https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/">429. N 叉树的层序遍历</a>
 * Date: 2021-08-22
 *
 * @author chenxi
 */
public class Solution01 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (queue.peek() == null) {
                    continue;
                }
                Node node = queue.poll();
                level.add(node.val);
                queue.addAll(node.children);
            }
            result.add(level);
        }

        return result;
    }
}

