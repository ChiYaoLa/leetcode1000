package com.company.LinkedList;

/**
 * @Author xuliang98
 * @Date 2021/5/23
 * Description:
 */
public class Leetcode_234 {
    public boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // reverse
        ListNode pre = null;
        ListNode curr = slow; // slow是右半部分的head
        while (curr != null){
            ListNode next = curr.next;

            curr.next = pre;
            pre = curr;
            curr = next;
        }
        // pre 是反转的头节点

        // 比较
        while (head != null && pre != null){
            if (head.val != pre.val)  return  false;
            head = head.next;
            pre = pre.next;
        }
        return true;
    }


}
