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
        HashSet<ListNode> myhash = new HashSet<>();
        ListNode temp = headA;
        while(temp!=null){
            myhash.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while(temp!=null){
            if(myhash.contains(temp)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
}