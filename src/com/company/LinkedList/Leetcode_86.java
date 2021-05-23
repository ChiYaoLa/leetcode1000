package com.company.LinkedList;

/**
 * @Author xuliang98
 * @Date 2021/5/22
 * Description:
 */
public class Leetcode_86 {


    // 模拟两个链表
    public ListNode partition(ListNode head, int x) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode l1pre = l1;
        ListNode l2pre = l2;

        while (head != null){
            if (head.val <= x ){
                l1.next = head;
                l1 = l1.next;
            }else {
                l2.next = head;
                l2 = l2.next;

            }

            head = head.next;
        }
        l2.next = null;
        l1.next = l2pre.next;
        return l1pre.next;
    }
}
