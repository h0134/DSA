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
    public ListNode middleNode(ListNode head) {
        int count =0;
        ListNode temp=head;
        if(head.next==null){
            return head;
        }
        while (temp!=null){
            count++;
            temp=temp.next;
        }

        int middleNode = (count)/2;

 count=0;
  temp=head;
        while (temp!=null){
            count++;
            temp=temp.next;

            if(count==middleNode){
                return temp;
            }

        }
        return  null;

    }

        
        
    }
