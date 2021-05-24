package com.company.LinkedList;

import java.util.List;

/**
 * @Author xuliang98
 * @Date 2021/5/23
 * Description:
 */
public class Leetcode_143 {
    public void reorderList(ListNode head) {
        //分割
        ListNode fast =  head;
        ListNode slow =  head;
        while (fast != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode right = slow.next;
        ListNode left = head;
        slow.next = null;

        // reverse right
        ListNode pre = null;
        ListNode curr = right;

        while (curr!=null){
            ListNode next = curr.next;

            curr.next = pre;
            pre = curr;
            curr = next;
        }
        right = pre;


        // merge

        ListNode res = new ListNode(0,head); //

        while (res!= null && left != null && right != null){
            res.next = left;
            res = res.next;
            res.next  = right;
            res = res.next;

            left = left.next;
            right = right.next;

        }
        if (left!=null){
            res.next = left;
        }
        if (right != null){
            res.next = right;
        }
    }


}
