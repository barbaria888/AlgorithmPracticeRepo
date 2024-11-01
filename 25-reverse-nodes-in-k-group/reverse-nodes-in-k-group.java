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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null||k==0)
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
        int itr= size/k;
        ListNode last= curr;
        ListNode leap=prev;
        while(itr>0)
        {
            for(int i=0;i<k;i++)
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