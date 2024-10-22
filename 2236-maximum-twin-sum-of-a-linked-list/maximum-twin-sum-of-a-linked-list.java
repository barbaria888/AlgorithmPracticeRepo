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
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
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
    public int pairSum(ListNode head) {
        int max=Integer.MIN_VALUE;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=reverse(slow);
        fast=head;
        while(fast!=null&&slow!=null)
        {  
            
            int curr= fast.val+slow.val;
            if(curr>max)
            {
                max=curr;
            }
            fast=fast.next;
            slow=slow.next;

        }
        return max;
    }
}