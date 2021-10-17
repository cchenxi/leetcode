package io.github.cchenxi.leetcode.algorithm2.p111;

/**
 * <a href="https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/">111. 二叉树的最小深度</a>
 * Date: 2021-10-17
 *
 * @author chenxi
 */
public class Solution01 {
    public int minDepth(TreeNode root) {
        return helper(root);
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null || root.right == null) {
            return Math.max(helper(root.left), helper(root.right)) + 1;
        }

        return Math.min(helper(root.left), helper(root.right)) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
