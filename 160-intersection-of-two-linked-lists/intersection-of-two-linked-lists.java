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
        int countA=0;
        int countB=0;
        ListNode temp = headA;
        while(temp!=null){
            countA++;
            temp=temp.next;
        }
        temp=headB;
      while(temp!=null){
            countB++;
            temp=temp.next;
        }

        int diff = Math.abs(countA-countB);
        if(countB>countA){
             while(diff!=0){
                headB=headB.next;
                diff--;
            }
    
        }
        else if (countA>countB){
             while(diff!=0){
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