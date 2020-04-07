package com.upcode.ArrayAb;


//反转一个单链表。示例:
//        输入: 1->2->3->4->5->NULL
//        输出: 5->4->3->2->1->NULL

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class TwoHundredandSix {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    //采用尾插法
    public ListNode reverseList(ListNode head) {
//       ListNode curr = head;
//       while (curr != null){
//
//           ListNode tempNode = curr.next;
//           curr.next = prev;
//           prev = curr;
//           curr = tempNode;

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode TNode = curr;
            curr = TNode.next;
            TNode.next = prev;
            prev = TNode;
            TNode = curr;
        }


        return prev;
    }



}




