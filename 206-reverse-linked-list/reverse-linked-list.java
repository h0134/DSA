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
     ListNode prev =null;
     ListNode output =null;
     if(head==null){
        return null;
     }
     while(head!=null){
     ListNode nextNode = head.next;
     head.next = prev;
     prev=head;
     head= nextNode;
     if(head==null){
        output=prev;
     }
}
return output;
        
    }
}