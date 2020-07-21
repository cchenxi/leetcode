package com.cchenxi.leetcode.algorithm.n24;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 *  
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * Date: 2020-07-21
 *
 * @author chenxi
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {

        return m2(head);
    }

    private ListNode m2(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;

        while (head != null && head.next != null) {
            //定义需要交换的两个节点
            ListNode first = head;
            ListNode second = head.next;

            //借助pre进行交换
            //pre的下一个节点指向第二个节点
            pre.next = second;
            //第一个节点的next 指向第二个节点的next
            first.next = second.next;
            //第二个节点的next指向第一个节点 完成交换
            second.next = first;

            //准备用于处理下个循环的数据，即将pre和head位置确认
            pre = first;
            head = first.next;
        }

        return dummy.next;
     }

    private ListNode m1(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode pre = dummy;

        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            pre.next = second;
            first.next = second.next;
            second.next = first;

            pre = first;
            head = first.next;
        }

        return dummy.next;
    }


}
