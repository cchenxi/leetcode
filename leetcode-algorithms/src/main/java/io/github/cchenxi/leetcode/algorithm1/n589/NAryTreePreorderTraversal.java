package io.github.cchenxi.leetcode.algorithm1.n589;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :

 * 返回其前序遍历: [1,3,5,6,2,4]。
 *
 *  
 *
 * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * Date: 2020-07-05
 *
 * @author chenxi
 */
public class NAryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        return m1(root);
    }

    public List<Integer> m1(Node root) {
        List<Integer> result = new ArrayList<>();
        help(root, result);
        return result;
    }

    public void help(Node root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);
            if (root.children != null && root.children.size() > 0) {
                for (Node child : root.children) {
                    help(child, result);
                }
            }
        }
    }

    public static class  Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
