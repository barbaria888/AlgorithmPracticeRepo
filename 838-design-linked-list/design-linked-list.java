class MyLinkedList {
    static class node {
        int data;
        node next;
        public node(int data) 
        {
            this.data=data;
        }
    }
    node head;
    node tail;
    int size = 0;
    public MyLinkedList() {}
    public int get(int index) {
        if (index<0||index>=size)
        {
            return -1;
        }
        node temp = head;
        for (int i=0;i<index;i++)
        {
        
            temp = temp.next;
        }
        return temp.data;
    }

    public void addAtHead(int val)
    {
        node newHead = new node(val);
        newHead.next = head;
        head = newHead;
        if (size==0) {
            tail=head;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (size==0)
        {
            addAtHead(val);
            return;
        }
        tail.next=new node(val);
        tail=tail.next;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index<0||index>size)
        { 
            return;
        }
        if (index==0)
        {
            addAtHead(val);
            return;
        }
        if (index==size) 
        {
            addAtTail(val);
            return;
        }
        node curr=head;
        for (int i=0;i<index-1;i++)
        {
            curr=curr.next;
        }
        node newnode=new node(val);
        newnode.next=curr.next;
        curr.next=newnode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index<0||index>=size) 
        {
            return;
        }
        if(index==0) 
        {
            head=head.next;
            if (size==1) 
            {
                tail=null;
            }
            size--;
            return;
        }
        
        node temp=head;
        for (int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(index==size-1) 
        {
            tail=temp;
        }
        size--;
    }
}
