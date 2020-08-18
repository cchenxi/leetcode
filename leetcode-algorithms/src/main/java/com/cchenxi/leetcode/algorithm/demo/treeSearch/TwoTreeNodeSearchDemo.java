package com.cchenxi.leetcode.algorithm.demo.treeSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 * 二叉树搜索 DFS and BFS
 *
 * Date: 2020-07-19
 *
 * @author chenxi
 */
public class TwoTreeNodeSearchDemo {
    /**
     * 深度优先遍历二叉树
     * 递归
     *
     * @param root
     * @return
     */
    public List<Integer> dfs(TwoTreeNode root) {
        Set<TwoTreeNode> visited = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        helpDfs(visited, root, result);
        return result;
    }

    private void helpDfs(Set<TwoTreeNode> visited, TwoTreeNode root, List<Integer> result) {
        if (root == null || visited.contains(root)) {
            return;
        }
        visited.add(root);
        result.add(root.val);
        helpDfs(visited, root.left, result);
        helpDfs(visited, root.right, result);
    }

    /**
     * 深度优先遍历二叉树
     * 非递归
     *
     * @param root
     * @return
     */
    public List<Integer> dfs2(TwoTreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>();
        Stack<TwoTreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                result.add(root.val);
                stack.push(root);
                root = root.left;
            } else {
                TwoTreeNode node = stack.pop();
                root = node.right;
            }
        }
        return result;
    }

    /**
     * 广度优先遍历二叉树
     *
     * @param root
     * @return
     */
    public List<Integer> bfs(TwoTreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>();
        Queue<TwoTreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TwoTreeNode node = nodes.poll();
                result.add(node.val);
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }
        }
        return result;
    }
}
