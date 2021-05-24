package com.company.LinkedList;

/**
 * @Author xuliang98
 * @Date 2021/5/23
 * Description:
 */
public class Leetcode_445 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res1 = reverse(l1);
        ListNode res2 = reverse(l2);
        ListNode res = new ListNode(0,null);
        ListNode ress = res;

        int carry = 0;
        while (res1!=null && res2!= null){ // 我还是坚定使用&& 之后在2个if 或者while的方法 ，处理连表吧
            int sum = res1.val + res2.val + carry;
            res.next = new ListNode(sum%10);
            res = res.next;
            res1 = res1.next;
            res2 = res2.next;
            carry = sum/10;
        }

        while (res1 != null){  //不等长的部分继续加
            int sum = res1.val + carry;
            res.next = new ListNode(sum%10);
            res = res.next;
            res1 = res1.next;
            carry = sum/10;
        }

        while (res2 != null){ //不等长的部分继续加
            int sum = res2.val+carry;
            res.next = new ListNode(sum%10);
            res = res.next;
            res2 = res2.next;
            carry = sum/10;
        }

        // fix 【5】【5】的case
        if (carry != 0 ) res.next = new ListNode(carry);

        // 再反转
        ListNode reverse = reverse(ress.next);
        return reverse;

    }

    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode next = curr.next;

            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

}
