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
    {
        ListNode temp=head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        return size;
    }
    public int getDecimalValue(ListNode head) {
        int n=size(head)-1;
        int ans=0;
        while(head!=null)
        {
            ans+=Math.pow(2,n)*head.val;
            head=head.next;
            n--;
        }
        return ans;

    }
}