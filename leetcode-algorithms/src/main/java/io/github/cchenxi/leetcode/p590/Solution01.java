package io.github.cchenxi.leetcode.p590;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/">590. N 叉树的后序遍历</a>
 * Date: 2021-08-21
 *
 * @author chenxi
 */
public class Solution01 {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    private void postOrder(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        root.children.forEach(c -> postOrder(c, result));
        result.add(root.val);
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
