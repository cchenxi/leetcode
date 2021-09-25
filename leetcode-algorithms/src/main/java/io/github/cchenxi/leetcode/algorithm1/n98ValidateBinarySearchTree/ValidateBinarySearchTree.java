package io.github.cchenxi.leetcode.algorithm1.n98ValidateBinarySearchTree;

import java.util.Stack;

/**
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例 1:
 *
 * 输入:
 *     2
 *    / \
 *   1   3
 * 输出: true
 * 示例 2:
 *
 * 输入:
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 *      根节点的值为 5 ，但是其右子节点值为 4 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/validate-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * Date: 2020-07-12
 *
 * @author chenxi
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return m3(root);
    }

    /**
     * 中序遍历二叉树，看是否是升序的
     *
     * @param root
     * @return
     */
    public boolean m1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Integer tmp = null;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (tmp != null && root.val < tmp) {
                return false;
            }
            tmp = root.val;
            root = root.right;
        }
        return true;
    }

    /**
     * 二叉树的左子树不为空，则左子树上所有节点均小于它根节点的值
     * 若二叉树右子树不为空，则右子树上所有节点均大于它跟阶段的值
     * 左右子树也均是二叉搜索树
     *
     * @param root
     * @return
     */
    public boolean m2(TreeNode root) {
        return help(root, null, null);
    }

    private boolean help(TreeNode root, Integer lower, Integer upper) {
        if (root == null) {
            return true;
        }

        int val = root.val;
        if (lower != null && val <= lower) {
            return false;
        }
        if (upper != null && val >= upper) {
            return false;
        }

        //调用递归左子树时，需要将上界upper修改为root.val
        if (!help(root.left, lower, val)) {
            return false;
        }
        //调用递归右子树时，需要将下届lower修改为root.val
        if (!help(root.right, val, upper)) {
            return false;
        }
        return true;
    }

    /**
     * 递归
     *
     * @param root
     * @return
     */
    public boolean m3(TreeNode root) {
        if (root == null) {
            return true;
        }

        return helper(root.left, Long.MIN_VALUE, root.val) && helper(root.right, root.val, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }
        if (root.val <= minValue || root.val >= maxValue) {
            return false;
        }
        return helper(root.left, minValue, root.val) && helper(root.right, root.val, maxValue);
    }

    /**
     * 中序遍历
     *
     * 中序遍历的结果是有序的
     *
     * @param root
     * @return
     */
    Integer pre = null;
    boolean result = true;

    public boolean m4(TreeNode root) {
        if (root == null) {
            return true;
        }

        helper(root);
        return result;
    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);

        if (pre != null && root.val <= pre) {
            result = false;
        }
        pre = root.val;

        helper(root.right);
    }
}
