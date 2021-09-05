package io.github.cchenxi.leetcode.simulation.m20210905;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO: description
 * Date: 2021-09-05
 *
 * @author chenxi
 */
public class Main02 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        Deque<ListNode> stack = new LinkedList<>();
        ListNode cur = dummy;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode pre = stack.peek();
        pre.next = pre.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Main02 main02 = new Main02();
        main02.removeNthFromEnd(node1, 2);
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
