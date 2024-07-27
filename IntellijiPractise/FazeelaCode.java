package com.shaheer;

public class FazeelaCode {
    public static void main(String[] args) {
        FMyLinkedList l = new FMyLinkedList();
        l.insertAtEnd(12);
        l.display();
        l.insertAtStart(11);
        l.display();
        l.insertAt(2,9);
        l.display();
        l.deleteAtEnd();
        l.display();
        l.deleteAtStart();
        l.display();
        l.insertAtStart(1);
        l.insertAtStart(2);
        l.display();
        l.deleteAt(2);
        l.display();

    }
}
class FMyLinkedList
{
    class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;

        }

    }
    Node head;
    Node tail;
    int size;
    FMyLinkedList()
    {
        head=null;
        tail=null;
        size=0;
    }
    boolean isEmpty()
    {
        return size==0;
    }
    void display()
    {
        Node temp=head;
        for(int i=1;i<=size;i++)
        {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }
    void insertAtStart(int item)
    {
        Node n=new Node(item);
        if(isEmpty())
        {
            head=n;
            tail=n;
            size++;
        }
        else
        {
            n.next=head;
            head=n;
            size++;
        }

    }
    void insertAtEnd(int item)
    {
        Node n=new Node(item);
        if(isEmpty())
        {
            head=n;
            tail=n;
            size++;
        }
        else
        {
            tail.next=n;
            tail=n;
            size++;
        }
    }
    void insertAt(int pos,int item)
    {
        Node n=new Node(item);
        if(pos>=size+2||pos<=0)
        {
            System.out.println("Invalid Position");
        }
        else if(pos==1)
        {
            insertAtStart(item);
        }
        else if(pos==size+1)
        {
            insertAtEnd(item);
        }
        else
        {
            Node temp=head;
            for(int i=2;i<pos-1;i++)
            {
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
            size++;
        }
    }




    int deleteAtStart()
    {
        int temp=0;
        if(isEmpty())
        {
            System.out.println("List is Empty");
        }
        else if(head.next==null)
        {
            temp=head.data;
            head=null;
            tail=null;
            size--;
        }
        else
        {
            temp=head.data;
            head=head.next;
            size--;
        }
        return temp;
    }
    int deleteAtEnd()
    {
        int temp=0;
        if(isEmpty())
        {
            System.out.println("List is Empty");
        }
        else if(head.next==null)
        {
            temp=head.data;
            head=null;
            tail=null;
            size--;
        }
        else
        {
            temp=tail.data;
            Node temp1=head;
            for(int i=2;i<=size-1;i++)
            {
                temp1=temp1.next;
                tail=temp1;
                tail.next=null;
                size--;
            }
        }
        return temp;
    }
    int deleteAt(int pos)
    {
        int temp=0;
        if(pos>size+1||pos<=0)
        {
            System.out.println("Invalid Position");
        }
        else if(pos==1)
        {
            temp=deleteAtStart();
        }
        else if(pos==size+1)
        {
            temp=deleteAtEnd();
        }
        else
        {
            Node temp1=head;
            for(int i=2;i<=pos-1;i++)
            {
                temp1=temp1.next;
            }
            temp=temp1.next.data;
            temp1.next=temp1.next.next;
            size--;
        }
        return temp;
    }




    void update(int pos,int item)
    {
        if(pos>size||pos<=0)
        {
            System.out.println("Invalid Position");
        }
        else
        {
            Node temp=head;
            for(int i=2;i<=pos;i++)
            {
                temp=temp.next;
            }
            temp.data=item;
        }
    }
}