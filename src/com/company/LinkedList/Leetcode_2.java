package com.company.LinkedList;

/**
 * @Author xuliang98
 * @Date 2021/5/22
 * Description:
 */
public class Leetcode_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry = 0;
        while (l1 != null || l2 != null){

            if(l1 == null) l1.val = 0;
            if (l2 == null) l2.val = 0;

            int i = l1.val + l2.val + carry;
            l3.next = new ListNode(i%10);
            l3 = l3.next;

            carry = carry/10;

            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }

        }

        return head.next;

    }


}
