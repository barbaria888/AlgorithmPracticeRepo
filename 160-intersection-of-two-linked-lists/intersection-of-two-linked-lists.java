/**
 * Definition for singly-linked list.
 
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
*/
public class Solution {
    public static int size(ListNode head) {
    ListNode curr = head;
    int size = 0;
    while (curr != null) 
    {
        size++;
        curr = curr.next;
    }
    return size;
    }

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {                      
        if (headA == null || headB == null) 
        {
          return null;
        }
        int n1 = size(headA);
        int n2 = size(headB);
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        
        if (n1 > n2) {
            int diff = n1 - n2;
            for (int i = 0; i < diff; i++) {
                ptrA = ptrA.next;
            }
        } else if (n1 < n2) {
            int diff = n2 - n1;
            for (int i = 0; i < diff; i++) {
                ptrB = ptrB.next;
            }
        }


        while (ptrA != null && ptrB != null) 
        {
            if (ptrA == ptrB) 
            {
                return ptrA;
            }
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }

        return null; 
    }   
}