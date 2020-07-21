package com.cchenxi.leetcode.algorithm.n24;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-07-21
 *
 * @author chenxi
 */
public class SwapNodesInPairsTest {
    private SwapNodesInPairs c;
    private ListNode head;

    @Before
    public void setUp() throws Exception {
        c = new SwapNodesInPairs();
        head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        head.next = n2;
        ListNode n3 = new ListNode(3);
        n2.next = n3;
        ListNode n4 = new ListNode(4);
        n3.next = n4;
    }

    @Test
    public void swapPairs() {
        ListNode result = c.swapPairs(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}