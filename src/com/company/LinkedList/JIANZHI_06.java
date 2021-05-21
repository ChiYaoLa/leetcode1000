package com.company.LinkedList;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;
import java.util.Stack;

/**
 * @Author xuliang98
 * @Date 2021/5/20
 * Description:剑指 Offer 06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */



public class JIANZHI_06 {
    public int[] reversePrint(ListNode head) {
        ListNode p =  head;
        Stack<ListNode> stacks = new Stack<ListNode>();
        while (p != null){
            stacks.push(p);
            p= p.next;
        }
        int[] ints = new int[stacks.size()];
        for (int i = 0; i < stacks.size(); i++) {
            ints[i] = stacks.pop().val;
        }
        return ints;
    }

    class ListNode{
        int val;

        public ListNode next;

        ListNode(int x){
            this.val = x;
        }


    }
}
