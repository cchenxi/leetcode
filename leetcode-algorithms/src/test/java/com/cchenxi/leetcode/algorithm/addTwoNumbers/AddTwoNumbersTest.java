package com.cchenxi.leetcode.algorithm.addTwoNumbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        ListNode v1 = new ListNode(2);
        v1.next = new ListNode(4);
        v1.next.next = new ListNode(3);

        ListNode v2 = new ListNode(5);
        v2.next = new ListNode(6);
        v2.next.next = new ListNode(4);


        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(v1, v2);

        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);
        while (result != null || expected != null) {
            assertEquals(result.val, expected.val);
            result = result.next;
            expected = expected.next;
        }
    }
}