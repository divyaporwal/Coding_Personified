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
    public ListNode deleteDuplicates(ListNode head) {
        
        // bas case handle
        if(head == null || head.next == null) {
            return head;
        }
        
        // create a new node 
        ListNode temp = new ListNode(0);

        // point head to the next node.
        temp.next = head;
        
        // create another temporary node p to point to temp.
        ListNode p = temp;
        
        // loop until the p.ext is null and p.next.next is null
        while(p.next != null && p.next.next != null) {
            // check for the possible duplicates 
            if(p.next.val == p.next.next.val) {
                // store the duplicate in a var
                int duplicate = p.next.val;
                // check for the possible duplicate in a row as many 
                while(p.next != null && p.next.val == duplicate) {
                    p.next = p.next.next;
                }
            } else {
                // if no duplicates are present, then simply move on to the next node.
                p = p.next;
            }
        }
        return temp.next;
        
    }
}
