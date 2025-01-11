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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    
    ListNode node=null ;
    ListNode head=null;
    int quotient =0;
    while(l1!=null && l2!=null){
        int  sum = quotient + l1.val+l2.val;
        quotient =sum/10;
        int rem =sum %10;
        ListNode newnode = new ListNode(rem);
        if(node==null){
            node=newnode;
            head=node;
        }
        else{
            node.next=newnode;
            node=node.next;
            
        }
        l1=l1.next;
        l2=l2.next;
       
    }
   while(l1!=null){
     int  sum = quotient + l1.val;
        quotient =sum/10;
        int rem =sum %10;
        ListNode newnode = new ListNode(rem);
            node.next=newnode;
            node=node.next;
            l1=l1.next;
            
    }
 while(l2!=null){
     int  sum = quotient + l2.val;
        quotient =sum/10;
        int rem =sum %10;
        ListNode newnode = new ListNode(rem);
            node.next=newnode;
            node=node.next;
            l2=l2.next;
            
        }

        if(quotient>0){
                    ListNode newnode = new ListNode(quotient);
                       node.next=newnode;
            node=node.next;

        }
        return head;
    }
}
