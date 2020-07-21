package com.cchenxi.leetcode.algorithm.n141;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 2020-07-21
 *
 * @author chenxi
 */
public class LinkedListCycleTest {
    private LinkedListCycle c;
    private ListNode head;

    @Before
    public void setUp() throws Exception {
        c = new LinkedListCycle();
        head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        head.next = n2;
        ListNode n3 = new ListNode(3);
        n2.next = n3;
        ListNode n4 = new ListNode(4);
        n3.next = n4;
//        n4.next = n3;
    }

    @Test
    public void hasCycle() {
        System.out.println(
                c.hasCycle(head)
        );
    }
}