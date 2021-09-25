package io.github.cchenxi.leetcode.algorithm2.p429;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxi
 * @see <a href="https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/">429. N 叉树的层序遍历</a>
 * Date: 2021-08-22
 */
public class Solution03 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        levelOrder(root, 0, result);
        return result;
    }

    private void levelOrder(Node root, int level, List<List<Integer>> result) {
        if (result.size() <= level) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(root.val);
        for (Node child : root.children) {
            levelOrder(child, level + 1, result);
        }
    }
}