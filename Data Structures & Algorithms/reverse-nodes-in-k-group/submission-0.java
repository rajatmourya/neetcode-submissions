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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int count = 1;
        ListNode curr = head;
        while (curr.next != null) {
            count++;
            curr = curr.next;
        }
        count = count/k;
        curr = head;
        ListNode newHead = null;
        ListNode tail = null;

        for (int j = 0; j < k; j++) {
            ListNode next = curr.next;
            curr.next = newHead;
            newHead = curr;
            curr = next;
            if(j == 0)
                tail = newHead;
        }
        head = newHead;
        ListNode newTail = curr;

        for (int i = 1; i < count; i++) {
            newHead = null;
            for (int j = 0; j < k; j++) {
                ListNode next = curr.next;
                curr.next = newHead;
                newHead = curr;
                curr = next;
                if(j == 0)
                    newTail = newHead;
            }
            tail.next = newHead;
            tail = newTail;
        }
        if(curr != null){
            tail.next = curr;
        }
        return head;
    }
}
