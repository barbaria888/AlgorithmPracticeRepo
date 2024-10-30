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
        ListNode next=null;
        ListNode prev=null;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode l3= new ListNode();
        ListNode curr=l3;
        int carry=0;
        while ((l1!=null) || (l2!=null ) || (carry!=0) ) 
        {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1!=null)l1= l1.next;
            if (l2!=null)l2= l2.next;
        }
        return reverse(l3.next);
    }
}