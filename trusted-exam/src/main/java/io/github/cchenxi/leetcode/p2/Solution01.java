package io.github.cchenxi.leetcode.p2;

/**
 * @see <a href="https://leetcode-cn.com/problems/add-two-numbers/">两数相加</a>
 * Date: 2021-08-04
 *
 * @author chenxi
 */
public class Solution01 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 链表题，通常都有一个前驱节点
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;

        // 用于存储进位的值
        int up = 0;

        // 循环继续的条件
        while (l1 != null || l2 != null) {
            // 取链表当前位置的值，为空用0代替
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            // 计算和
            int sum = v1 + v2 + up;

            // 生成链表节点
            cur.next = new ListNode(sum / 10);
            // 当前位置后移
            cur = cur.next;
            // 计算进位值
            up = sum % 10;

            // 链表节点后移
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // 特别注意，循环完毕后需要注意最后一次计算是否需要进位
        if (up > 0) {
            cur.next = new ListNode(up);
        }

        // 返回前驱节点的next
        return pre.next;
    }
}
