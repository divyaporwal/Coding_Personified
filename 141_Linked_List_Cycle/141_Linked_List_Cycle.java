/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null) {
            return false;
        }
        
        
        ListNode slow_pointer = head;
        ListNode fast_pointer = head.next;
        
        while(slow_pointer!= null && fast_pointer!= null && fast_pointer.next != null) {
            if(slow_pointer == fast_pointer) {
                return true;
            }   
          
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
        }
        
        return false;
        
    }
}
