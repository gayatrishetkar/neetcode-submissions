/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode curr = head;
        while(curr != null) {
            size++;
            curr = curr.next;
        }
        if(n == size)
            return head.next;
            
        int x = size-n+1;

        ListNode temp = head;
        for(int i=1; i<x-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
