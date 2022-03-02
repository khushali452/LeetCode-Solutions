class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode result = null;  
        if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    }
        if(l1.val <= l2.val){
            result = l1;
            result.next= mergeTwoLists(l1.next, l2);
        }else{
            result = l2;
            result.next=mergeTwoLists(l1, l2.next);
        }
        return result;
    }
}