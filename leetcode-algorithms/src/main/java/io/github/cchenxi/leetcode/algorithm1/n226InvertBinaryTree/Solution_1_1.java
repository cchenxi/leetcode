package io.github.cchenxi.leetcode.algorithm1.n226InvertBinaryTree;

/**
 * Date: 2020-08-30
 *
 * @author chenxi
 */
public class Solution_1_1 implements InvertBinaryTree {
    @Override
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
