package io.github.cchenxi.leetcode.algorithm1.n206;

import io.github.cchenxi.leetcode.algorithm1.n206.ReverseLinkedList;
import org.junit.Test;

/**
 * Date: 2020-07-08
 *
 * @author chenxi
 */
public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(1);
        head.next = new ReverseLinkedList.ListNode(2);
        head.next.next = new ReverseLinkedList.ListNode(3);
        ReverseLinkedList c = new ReverseLinkedList();
        c.reverseList(head);

        System.out.println(1);
    }
}