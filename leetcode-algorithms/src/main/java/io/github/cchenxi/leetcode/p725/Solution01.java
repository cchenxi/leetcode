package io.github.cchenxi.leetcode.p725;

/**
 * <a href="https://leetcode-cn.com/problems/split-linked-list-in-parts/">725. 分隔链表</a>
 * Date: 2021-09-22
 *
 * @author chenxi
 */
public class Solution01 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }

        ListNode[] result = new ListNode[k];
        int len = length / k;
        int mod = length % k;

        for (int i = 0; i < k; i++) {
            ListNode dummy = new ListNode(-1);
            ListNode node = dummy;
            for (int j = 0; j < (i < mod ? len + 1 : len); j++) {
                if (head != null) {
                    node.next = new ListNode(head.val);
                    node = node.next;
                    head = head.next;
                }
            }
            result[i] = dummy.next;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(8);
        ListNode listNode9 = new ListNode(9);
        ListNode listNode10 = new ListNode(10);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;
        listNode9.next = listNode10;

        Solution01 solution = new Solution01();
        System.out.println(
            solution.splitListToParts(listNode1, 3)
        );
    }
}

class ListNode {
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

