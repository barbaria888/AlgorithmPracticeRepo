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

    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
           int size=0;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            size++;
            curr=curr.next;
        }
        curr=head;
        int itr= size/2;
        ListNode last= curr;
        ListNode leap=prev;
        while(itr>0)
        {
            for(int i=0;i<2;i++)
            {
                ListNode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            if(leap!=null)
            {
                leap.next=prev;
            }
            else
            {
                head=prev;
            }
            last.next=curr;
            itr--;
            leap=last;
            last=curr;
            
        }
        return head;
    }
}