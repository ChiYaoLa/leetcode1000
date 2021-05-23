package com.company.LinkedList;

/**
 * @Author xuliang98
 * @Date 2021/5/22
 * Description:
 */
public class Leetcode_287 {
    public int findDuplicate(int[] nums) {

        int slow = 0;
        int fast = 0;
        while (true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow ==  fast) break;
        }
        slow = 0;
        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
