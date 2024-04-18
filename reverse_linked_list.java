class nums{
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode reverse(ListNode head) {
        if(head.next==null)return head;
        if(head==null)return new ListNode();
        ListNode fast= head;
        ListNode slow= null;
        while(fast.next!=null)
        {
            slow = fast;
            fast =fast.next;


        }
return head;
    }
    public static void display(ListNode head){
        ListNode temp= head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        ListNode ll =new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4, new ListNode(5,null)))));
        System.out.println(ll.next.next.val);
        reverse(ll);
        ListNode tmep=ll;

        //display();
    }

}