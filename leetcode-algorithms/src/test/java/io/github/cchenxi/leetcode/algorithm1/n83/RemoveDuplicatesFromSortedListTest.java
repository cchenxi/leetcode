package io.github.cchenxi.leetcode.algorithm1.n83;

import io.github.cchenxi.leetcode.algorithm1.n83.ListNode;
import io.github.cchenxi.leetcode.algorithm1.n83.RemoveDuplicatesFromSortedList;
import org.junit.Before;
import org.junit.Test;

/**
 * Date: 2020-07-25
 *
 * @author chenxi
 */
public class RemoveDuplicatesFromSortedListTest {
    private RemoveDuplicatesFromSortedList c;
    private ListNode head;

    @Before
    public void setUp() throws Exception {
        c = new RemoveDuplicatesFromSortedList();
        head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        head.next = l2;
    }

    @Test
    public void deleteDuplicates() {
        ListNode result = c.deleteDuplicates(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}