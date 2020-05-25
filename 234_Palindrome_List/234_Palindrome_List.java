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
    public boolean isPalindrome(ListNode head) {
        
        // base case condition, when only one node present or no node present.
        if(head == null || head.next == null) {
            return true;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // mark the second head of the list
        ListNode head2 = slow.next;
        // point the next of the previous list to null so as to separate the list into
        // two parts.
        slow.next = null;
        // reverse the second list now
        
        ListNode p1 = head2;
        ListNode p2 = p1.next;
        while(p1 != null && p2 !=  null) {
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
        
        head2.next = null;
        
        //compare two lists now.
        // base case for odd even lists 
        ListNode p = p2 == null ? p1:p2;
        ListNode q = head;
        // compare the values now.
        while(p != null && q!= null) {
            if(p.val != q.val) {
                return false;
            }
            
            
            p = p.next;
            q = q.next;
        }
        return true;
        
        
    }
}
