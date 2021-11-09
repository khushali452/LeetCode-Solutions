/* Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.*/
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
import java.util.*;
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode prev = head;
        ListNode temp =prev;
        head=head.next;
        
        while(head !=null){
            if(head.val != prev.val){
                prev.next=head;
                prev=prev.next;
            }
            head= head.next;
        }
        prev.next=null;
        return temp;
    }
}

