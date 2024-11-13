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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode head1;
    ListNode head2;
    if(list1==null && list2==null){
        return null;
    }
    else  {
        if(list1==null){
        return list2;
    }
    else if (list2==null){
        return list1;
    }
    }
  
  if(list1.val<list2.val){
    head2 =list1;

list1=list1.next;
  }
  else{
    head2=list2;
    list2=list2.next;
  }
  head1=head2;
  while(list1!=null && list2!=null){
    if(list1.val>list2.val){
        head2.next=list2;
        head2=list2;
        list2=list2.next;

    }
    else if(list1.val<=list2.val){
        head2.next=list1;
        head2=list1;
        list1=list1.next;

    }
    
  }
  if(list1!=null){
    head2.next=list1;
  }
  else if (list2!=null){
    head2.next = list2;
  }
  return head1;

}}