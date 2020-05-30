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
    public ListNode removeElements(ListNode head, int val) {
        // initialize a dummy node
        ListNode sentinel = new ListNode(0);
        // set the next of this node to head
        sentinel.next = head;
        // mark prev as sentinel
        // mark curr as head
        ListNode prev = sentinel, curr = head;
        
        // loop until curr is null
        while (curr!= null) {
            if(curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        
        return sentinel.next;
    }
}
