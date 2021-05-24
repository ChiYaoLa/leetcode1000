package com.company.LinkedList;

/**
 * @Author xuliang98
 * @Date 2021/5/22
 * Description:
 */
public class Leetcode_142 {
    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = head;

        while (true){
            if (fast == null || fast.next == null) return null;
            // 因为下面 快指针要走两步 fast.next.next
            // 不能出现 null.next 的问题，这里得处理好空指针的问题
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        // 一个指针指向head 一个汇聚点，同时出发就可以
        while (pre != slow){
            pre = pre.next;
            slow = slow.next;
        }

        return slow;
    }
}
