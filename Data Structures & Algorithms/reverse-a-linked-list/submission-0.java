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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode temp = current.next;
        head.next = null;
        while(temp != null){
            head = temp;
            temp = temp.next;
            head.next = current;     
            current = head;     
        }
        return head;
    }
}
