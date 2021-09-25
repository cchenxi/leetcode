package io.github.cchenxi.leetcode.algorithm1.demo.treeSearch;

import java.util.List;

import io.github.cchenxi.leetcode.algorithm1.demo.treeSearch.TwoTreeNode;
import io.github.cchenxi.leetcode.algorithm1.demo.treeSearch.TwoTreeNodeSearchDemo;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-07-19
 *
 * @author chenxi
 */
public class TwoTreeNodeSearchDemoTest {
    private TwoTreeNode root;
    private TwoTreeNodeSearchDemo twoTreeNodeSearchDemo;

    @Before
    public void setUp() {
        twoTreeNodeSearchDemo = new TwoTreeNodeSearchDemo();

        root = new TwoTreeNode(1);
        TwoTreeNode n2 = new TwoTreeNode(2);
        TwoTreeNode n3 = new TwoTreeNode(3);
        TwoTreeNode n4 = new TwoTreeNode(4);
        TwoTreeNode n5 = new TwoTreeNode(5);
        TwoTreeNode n6 = new TwoTreeNode(6);
        TwoTreeNode n7 = new TwoTreeNode(7);
        TwoTreeNode n8 = new TwoTreeNode(8);

        root.left = n2;
        root.right = n5;
        n2.left = n3;
        n3.left = n4;
        n5.left = n6;
        n5.right = n8;
        n6.left = n7;
    }

    @Test
    public void dfs() {
        List<Integer> result = twoTreeNodeSearchDemo.dfs(root);
        System.out.println(1);
    }


    @Test
    public void dfs2() {
        List<Integer> result = twoTreeNodeSearchDemo.dfs2(root);
        System.out.println(1);
    }

    @Test
    public void bfs() {
        List<Integer> result = twoTreeNodeSearchDemo.bfs(root);
        System.out.println(1);
    }
}