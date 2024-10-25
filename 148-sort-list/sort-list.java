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
    
    public static ListNode mid(ListNode head)
    {
        if(head==null||head.next==null){return head;}
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null)
        {
            
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode MergeSort(ListNode l1,ListNode l2)
    {   
        
        ListNode dummy = new ListNode(0);
        ListNode curr=dummy;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<l2.val)
            {
                curr.next=l1;
                l1=l1.next;
            }
            else
            {
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        curr.next=(l1!=null)?l1:l2;
        return dummy.next;
    }
    
    public ListNode sortList(ListNode head) 
    {
        if(head==null||head.next==null)return head;
        
        ListNode mid= mid(head);
        ListNode halve= mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right= sortList(halve);
        return MergeSort(left,right);
        
    }
}

