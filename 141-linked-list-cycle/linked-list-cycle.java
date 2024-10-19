/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast= head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            if(fast.next.next==slow)
            {
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}