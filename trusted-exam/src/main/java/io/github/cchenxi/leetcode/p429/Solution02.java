package io.github.cchenxi.leetcode.p429;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/">429. N 叉树的层序遍历</a>
 * Date: 2021-08-22
 *
 * @author chenxi
 */
public class Solution02 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Node> prevLevelNodes = Collections.singletonList(root);
        while (!prevLevelNodes.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            List<Node> curLevelNodes = new ArrayList<>();
            for (Node node : prevLevelNodes) {
                level.add(node.val);
                curLevelNodes.addAll(node.children);
            }
            result.add(level);
            prevLevelNodes = curLevelNodes;
        }
        return result;
    }
}