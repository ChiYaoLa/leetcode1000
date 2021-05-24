package com.company.LinkedList;

import java.util.List;

/**
 * @Author xuliang98
 * @Date 2021/5/22
 * Description:
 */
public class Leetcode_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow= new ListNode(0, head);  // 这个就是 提前后退一位
        ListNode res = slow; // 要考虑到 【1】n=1 的情况，必须这里不是head，而是指向slow，返回slow.next
        while (n != 0){
            n -= 1;
            fast = fast.next;
        }

        while (fast != null){  // 因为退出的时候 fast是null，fast.next很容易空指针
            fast = fast.next;
            slow = slow.next;
        }
        // 此时fast 是null，那么slow差两位就恰好在要删除的点上，必须得后退一位
        slow.next = slow.next.next;
        return res.next;
    }
}
