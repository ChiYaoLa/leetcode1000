package com.company.LinkedList;

import com.company.LinkedList.ListNode;

/**
 * @Author xuliang98
 * @Date 2021/5/23
 * Description:
 */
public class Leetcode_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode res = dummy;
        // node1 node2的初始化放在while里，那么while的退出条件就完全给予dummy，推进条件也基于dummy，整个就简洁了
        while (dummy.next != null && dummy.next.next != null){
            ListNode node1 = dummy.next;
            ListNode node2 = dummy.next.next;
            dummy.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            // dummy就类似之前的curr,很简洁
            dummy = dummy.next.next;
        }
        return res.next;
    }
}
