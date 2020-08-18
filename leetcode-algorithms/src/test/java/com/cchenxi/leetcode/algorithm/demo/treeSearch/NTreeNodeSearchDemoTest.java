package com.cchenxi.leetcode.algorithm.demo.treeSearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-07-19
 *
 * @author chenxi
 */
public class NTreeNodeSearchDemoTest {
    private NTreeNodeSearchDemo nTreeNodeSearchDemo;
    private NTreeNode root;

    @Before
    public void setUp() throws Exception {
        nTreeNodeSearchDemo = new NTreeNodeSearchDemo();
        root = new NTreeNode(1);
        NTreeNode n2 = new NTreeNode(2);
        NTreeNode n3 = new NTreeNode(3);
        NTreeNode n4 = new NTreeNode(4);
        NTreeNode n5 = new NTreeNode(5);
        NTreeNode n6 = new NTreeNode(6);
        NTreeNode n7 = new NTreeNode(7);
        NTreeNode n8 = new NTreeNode(8);
        NTreeNode n9 = new NTreeNode(9);
        NTreeNode n10 = new NTreeNode(10);

        root.children = Arrays.asList(n2, n5, n9);
        n2.children = Collections.singletonList(n3);
        n3.children = Collections.singletonList(n4);
        n5.children = Arrays.asList(n6, n8);
        n6.children = Collections.singletonList(n7);
        n9.children = Collections.singletonList(n10);
    }

    @Test
    public void dfs() {
        List<Integer> result = nTreeNodeSearchDemo.dfs(root);
        System.out.println(1);
    }

    @Test
    public void bfs() {
        List<Integer> result = nTreeNodeSearchDemo.bfs(root);
        System.out.println(1);
    }
}