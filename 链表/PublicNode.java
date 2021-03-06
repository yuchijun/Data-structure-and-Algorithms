/**
 * 双指针法，指针1走完后跳到第二个链表，指针2走完后跳到第一个链表；
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode cur1 = headA;
        ListNode cur2 = headB;

        while(cur1 != cur2){
            cur1 = cur1 == null?  headB : cur1.next;
            cur2 = cur2 == null? headA : cur2.next;
        }
        return cur1;

        
    }
}