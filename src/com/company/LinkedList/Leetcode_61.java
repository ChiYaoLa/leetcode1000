package com.company.LinkedList;

/**
 * @Author xuliang98
 * @Date 2021/5/23
 * Description:
 */
public class Leetcode_61 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = head;
        ListNode slow = head;

        if (head == null) return null; //边界条件：listlen不能是0
        int listlen = 0;
        while (head != null){
            head = head.next;
            listlen +=  1;
        }
        k = k%listlen;  //循环链币都得取模
        while (k>0){
            fast = fast.next;
            k -= 1;
        }

        while (fast.next !=null){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;

        return dummy.next;
    }
}
