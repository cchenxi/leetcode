package io.github.cchenxi.leetcode.algorithm2.tree;

/**
 * 二叉树
 * Date: 2021-08-21
 *
 * @author chenxi
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
