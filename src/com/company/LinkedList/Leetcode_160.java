package com.company.LinkedList;

/**
 * @Author xuliang98
 * @Date 2021/5/22
 * Description:
 */
public class Leetcode_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode prea = headA;
        ListNode preb = headB;

        if (headA ==null || headB == null){
            return null;
        }

        while (true){
            if (headA == headB) break; // 这行代码的位置有讲究，比如【1】【1】 ，你写在后面测试用例过不了
            if (headA == null) {
                headA = preb;
            }else {
                headA = headA.next;
            }

            if (headB == null) {
                headB = prea;
            }else {
                headB = headB.next;
            }


        }
        return headA;
    }
}
