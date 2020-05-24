/**
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
        
        ListNode p1 = headA;
        ListNode p2 = headB;
        
        if(p1 == null || p2 == null) {
            return null;
        }
        
        int count1 = 0;
        int count2 = 0;
        
        // count the number of nodes in both the lists
        while(p1 != null) {
            count1++;
            p1 = p1.next;
        }
        
        while(p2!= null) {
            count2++;
            p2 = p2.next;
        }
        
        p1 = headA;
        p2 = headB;
        int diff = 0;
        
        // iterate through the excess nodes in the longer list to arrive at the same level
        if(count1 > count2) {
            diff = (count1-count2);
             int i = 0;
            while(i < diff) {
                p1 = p1.next;
                i++;
            }
        } else {
            diff = count2-count1;
             int i = 0;
            while(i < diff) {
                p2 = p2.next;
                i++;
            }
        }
        
        // check if the two nodes are equal while iterating through the remaining list
        while(p1 != null && p2 != null) {
            if(p1 == p2) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
        
    }
}
