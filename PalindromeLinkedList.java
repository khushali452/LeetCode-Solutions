/* 
234. Palindrome Linked List

Given the head of a singly linked list, return true if it is a palindrome.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 

Follow up: Could you do it in O(n) time and O(1) space?
*/
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
        ListNode slow=head;
        ListNode fast =head;
        ListNode curr= head;
        ListNode prev= null;
        
        if(head==null || head.next ==null)
            return true;
        
        while(fast!=null && fast.next!=null){
            curr=slow;
            slow=slow.next;
            fast= fast.next.next;
            curr.next=prev;
            prev=curr;
        }
        if(fast!=null)
            slow=slow.next;
        
        while(prev!=null && prev.val==slow.val){
            prev =prev.next;
            slow= slow.next;
            
        }
        return (prev==null);
    }
}