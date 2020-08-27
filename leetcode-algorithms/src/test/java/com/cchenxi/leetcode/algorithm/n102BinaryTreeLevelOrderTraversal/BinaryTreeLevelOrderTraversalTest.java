package com.cchenxi.leetcode.algorithm.n102BinaryTreeLevelOrderTraversal;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-08-25
 *
 * @author chenxi
 */
public class BinaryTreeLevelOrderTraversalTest {
    private BinaryTreeLevelOrderTraversal c;

    TreeNode root = new TreeNode(1);
    TreeNode t2 = new TreeNode(2);
    TreeNode t3 = new TreeNode(3);
    TreeNode t4 = new TreeNode(4);
    TreeNode t5 = new TreeNode(5);

    @Before
    public void setUp() throws Exception {
        c = new Solution_2_1();
        root.left = t2;
        root.right = t3;
        t2.left = t4;
        t3.right = t5;
    }

    @Test
    public void levelOrder() {
        List<List<Integer>> result = c.levelOrder(root);
        System.out.println(1);
    }
}