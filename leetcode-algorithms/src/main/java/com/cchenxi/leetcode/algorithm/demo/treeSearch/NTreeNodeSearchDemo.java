package com.cchenxi.leetcode.algorithm.demo.treeSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * n叉树搜索
 * Date: 2020-07-19
 *
 * @author chenxi
 */
public class NTreeNodeSearchDemo {
    /**
     * 深度优先遍历
     *
     * @param root
     * @return
     */
    public List<Integer> dfs(NTreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>();
        Set<NTreeNode> visited = new HashSet<>();
        help(root, visited, result);
        return result;
    }

    private void help(NTreeNode root, Set<NTreeNode> visited, List<Integer> result) {
        if (root == null || visited.contains(root)) {
            return;
        }
        visited.add(root);
        result.add(root.val);
        if (root.children != null) {
            root.children.forEach(c -> help(c, visited, result));
        }
    }

    /**
     * 广度优先遍历n叉树
     *
     * @param root
     * @return
     */
    public List<Integer> bfs(NTreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>();
        Queue<NTreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                NTreeNode node = nodes.poll();
                result.add(node.val);
                if (node.children != null) {
                    node.children.forEach(c -> {
                        if (c != null) {
                            nodes.add(c);
                        }
                    });
                }
            }
        }
        return result;
    }
}
