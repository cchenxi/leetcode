package io.github.cchenxi.leetcode.algorithm1.n21;

import io.github.cchenxi.leetcode.algorithm1.n21.ListNode;
import io.github.cchenxi.leetcode.algorithm1.n21.MergeTwoSortedLists;
import org.junit.Test;

/**
 * Date: 2020-06-28
 *
 * @author chenxi
 */
public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        MergeTwoSortedLists cl = new MergeTwoSortedLists();
        ListNode l13 = new ListNode(4);
        ListNode l12 = new ListNode(2, l13);
        ListNode l11 = new ListNode(1, l12);

        ListNode l23 = new ListNode(4);
        ListNode l22 = new ListNode(3, l23);
        ListNode l21 = new ListNode(1, l22);

        ListNode result = cl.mergeTwoLists(l11, l21);
        System.out.println(1);
    }
}