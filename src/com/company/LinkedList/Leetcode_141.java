package com.company.LinkedList;

/**
 * @Author xuliang98
 * @Date 2021/5/22
 * Description:
 */
public class Leetcode_141 {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false; // 打补丁 测试用例：【1】1个节点无环
        ListNode fast = head.next;
        // 只要是快慢2倍的指针，最后肯定在环内相聚，
        // 相聚的位置 2n-n=n ，环的长度是n=3，说明相遇的时候快指针比满指针多走三步
        // 如果说 快指针比满指针 先走一步，那么最后的位置就是 快指针在出发点后再走两步的位置
        ListNode slow = head;


        while (fast != slow){    // 因为fast和slow相等，干脆while都不执行了
            if (fast == null || fast.next == null ) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
