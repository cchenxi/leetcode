package io.github.cchenxi.leetcode.algorithm2.p589;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/">589. N 叉树的前序遍历</a>
 * Date: 2021-08-21
 *
 * @author chenxi
 */
public class Solution01 {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    private void preOrder(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        root.children.forEach(c -> preOrder(c, result));
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
