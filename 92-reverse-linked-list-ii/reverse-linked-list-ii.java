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
    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null,curr=head,next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null||left==right)
        {
            return head;
        }
        ListNode  dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=0;i<left-1;++i)
        {
            prev=prev.next;
        }
        ListNode curr=prev.next;
        
        for(int i=0;i<right-left;i++)
        {
            ListNode nextnode=curr.next;
            curr.next=nextnode.next;
            nextnode.next=prev.next;
            prev.next=nextnode;
        }
        return dummy.next;
          
          }

}