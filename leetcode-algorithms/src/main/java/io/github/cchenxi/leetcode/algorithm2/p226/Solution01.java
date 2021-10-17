package io.github.cchenxi.leetcode.algorithm2.p226;

/**
 * <a href="https://leetcode-cn.com/problems/invert-binary-tree/description/">226. 翻转二叉树</a>
 * Date: 2021-10-17
 *
 * @author chenxi
 */
public class Solution01 {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode root) {
        // 退出条件
        if (root == null) {
            return;
        }

        // 当前层的逻辑
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        // 下一层的逻辑
        invert(root.left);
        invert(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

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
