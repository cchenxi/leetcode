package io.github.cchenxi.leetcode.p2;

/**
 * @see <a href="https://leetcode-cn.com/problems/add-two-numbers/">两数相加</a>
 * Date: 2021-08-04
 *
 * @author chenxi
 */
public class Solution01 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;

        int up = 0;
        while (l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int sum = v1 + v2 + up;

            cur.next = new ListNode(sum / 10);
            cur = cur.next;
            up = sum % 10;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (up > 0) {
            cur.next = new ListNode(up);
        }

        return pre.next;
    }
}
