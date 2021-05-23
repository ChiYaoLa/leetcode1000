package com.company.LinkedList;

import com.sun.org.apache.bcel.internal.generic.LUSHR;

import java.util.WeakHashMap;

/**
 * @Author xuliang98
 * @Date 2021/5/23
 * Description:
 */
public class Leetcode_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = head; //除了dummy，copy head也是一种策略
        if (res == null || res.next == null) return res;
        while (res!=null &&res.next != null){
            if (res.val == res.next.val){ //应对【1，1，1】用例
                ListNode res2 = res.next;
                while (res2!= null && res.val == res2.val){ // res2 内部小whie，也得防止空指针
                    res2 = res2.next;
                }
                res.next = res2;
            }
            res = res.next; //连表重要的就是循环体内 关键的指针（推进和推出）只有一个，如果模拟两个指针，也是给基于这个指针推算出来的，这样才不会乱
        }

        return head;
    }
}
