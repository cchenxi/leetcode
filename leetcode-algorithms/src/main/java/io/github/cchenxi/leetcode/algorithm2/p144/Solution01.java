package io.github.cchenxi.leetcode.algorithm2.p144;

import io.github.cchenxi.leetcode.algorithm2.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-preorder-traversal/">144. 二叉树的前序遍历</a>
 * Date: 2021-08-21
 *
 * @author chenxi
 */
public class Solution01 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    private void preOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }
}
