package com.company.LinkedList;

/**
 * @Author xuliang98
 * @Date 2021/5/23
 * Description:
 */
public class JIANZHI_24 {

//    "a"-"b"-"c"-"d"
    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode pre = null; // 提前模拟一个null节点，妙啊

        while (curr != null){
            ListNode next = curr.next; //是curr的next，还是三指针的结构

            curr.next = pre; // z-指针推进结构
            pre = curr;
            curr = next;

        }
        return pre;
    }
}
