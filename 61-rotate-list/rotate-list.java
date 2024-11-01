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
    public static int size(ListNode head)
    {   int size=1;
        while(head!=null)
        {
            head=head.next;
        }
        return size;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)
        {
            return head;
        }
        int size=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            size++;
            temp=temp.next;
        }
        temp.next=head;
        temp=temp.next;
        k=k%size;
        
        for(int i=0;i<(size-k-1);i++)
        {
            temp=temp.next;
        }
        ListNode head2=temp.next;
        temp.next=null;
        return head2;        
    }
}