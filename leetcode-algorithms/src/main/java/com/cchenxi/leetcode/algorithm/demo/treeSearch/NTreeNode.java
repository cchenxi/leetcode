package com.cchenxi.leetcode.algorithm.demo.treeSearch;

import java.util.List;

/**
 * n叉树
 * Date: 2020-07-19
 *
 * @author chenxi
 */
public class NTreeNode {
    public int val;
    public List<NTreeNode> children;

    public NTreeNode(int val) {
        this.val = val;
        this.children = null;
    }
}
