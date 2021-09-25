package io.github.cchenxi.leetcode.p429;

import java.util.List;

/**
 * Date: 2021-08-22
 *
 * @author chenxi
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
