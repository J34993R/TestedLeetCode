package src.Classes0000_0050;

import java.util.Stack;
/* Date: 01/06/2022
 * User: Guilherme Alves de Oliveira
 *
 * Source: https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * Success
 * Runtime: 1 ms, faster than 66.27% of Java online submissions for Merge Two Sorted Lists.
 * Memory Usage: 43.6 MB, less than 16.49% of Java online submissions for Merge Two Sorted Lists.
 *
 */
public class _0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null && list2 == null) {
            return null;
        }

        if(list1 != null && list2 == null) {
            return list1;
        }

        if(list1 == null && list2 != null) {
            return list2;
        }

        ListNode answerHead = null;
        ListNode answerTail = null;

        // Compare values of pointers i and j
        ListNode i = list1;
        ListNode j = list2;
        while(i != null && j != null) {
            if(i.val < j.val) {
                if(answerHead == null && answerTail == null) {
                    answerHead = i;
                    answerTail = i;
                } else {
                    answerTail.next = i;
                    answerTail = i;
                }
                i = i.next;
            } else {
                if(answerHead == null && answerTail == null) {
                    answerHead = j;
                    answerTail = j;
                } else {
                    answerTail.next = j;
                    answerTail = j;
                }
                j = j.next;
            }
        }

        if(i != null) {
            answerTail.next = i;
        }

        if(j != null) {
            answerTail.next = j;
        }

        return answerHead;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {this.val = val;}

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/*
For testing usage
    public int[] mergeTwoLists(int[] list1, int[] list2) {
        int[] ans = new int[list1.length+ list2.length];
        int count1 = 0;
        int count2 = 0;
        int k = 0;

        if(list1 == null && list2 == null){
            return null;
        }else if(list1 == null && list2 != null){
            return list2;
        }else if(list1 != null && list2 == null){
            return list1;
        }else {
            while(count1 < list1.length && count2 < list2.length){
                if(list1[count1] <= list2[count2]){
                    ans[k] = list1[count1];
                    count1++;
                }else {
                    ans[k] = list2[count2];
                    count2++;
                }
                k++;
            }
            while(count1 < list1.length){
                ans[k] = list1[k];
                count1++;
                k++;
            }
            while(count2 < list2.length){
                ans[k] = list2[count2];
                count2++;
                k++;
            }
        }

        return ans;
    }
 */