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
      ListNode temp = headA;
      int countList1=0;
      int countList2=0;
      int diff=0;

      while(temp!=null){
        countList1=countList1+1;
        temp=temp.next;

      }
      temp = headB;
     while(temp!=null){
        countList2=countList2+1;
        temp=temp.next;

    }
    if(countList2>countList1){
        diff= countList2-countList1;
        while(diff>0){
            headB=headB.next;
            diff--; 
            }

    }
    else{
        diff= countList1-countList2;
         while(diff>0){
            headA=headA.next;
            diff--; 
            }
            }

        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }


return null;


    }
}