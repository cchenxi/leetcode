package io.github.cchenxi.leetcode.algorithm2.p98;

/**
 * <a href="https://leetcode-cn.com/problems/validate-binary-search-tree/">98. 验证二叉搜索树</a>
 * Date: 2021-10-17
 *
 * @author chenxi
 */
public class Solution01 {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long min, long max) {
        // 退出条件
        if (root == null) {
            return true;
        }

        // 处理当前层
        if (root.val <= min || root.val >= max) {
            return false;
        }

        // 处理下一层
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
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
