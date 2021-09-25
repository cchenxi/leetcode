package io.github.cchenxi.leetcode.algorithm2.p94;

import io.github.cchenxi.leetcode.algorithm2.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/">94. 二叉树的中序遍历</a>
 * Date: 2021-08-21
 *
 * @author chenxi
 */
public class Solution01 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    private void inOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }
}
