package com.company.LinkedList;

/**
 * @Author xuliang98
 * @Date 2021/5/22
 * Description:
 */
public class Leetcode_328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(0);
        ListNode odd = new ListNode(0);
        ListNode pre = head;
        ListNode evenpre = even;
        ListNode oddpre = odd;

        int pos = 0;
        while (head != null){
            if (pos %2 == 0){
                odd.next = head;
                odd = odd.next;
            }else {
                even.next = head;
                even = even.next;
            }

            pos += 1;
            head = head.next;
        }

        even.next = null;
        odd.next = evenpre.next;

        return oddpre.next;
    }
}
