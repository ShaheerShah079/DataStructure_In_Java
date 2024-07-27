package linkedlist;

public class LinkedList
{
    public static void main(String[] args)
    {
        MyLinkedList l = new MyLinkedList();
        l.display();
        
        l.insertAtStart(1);
        l.insertAtEnd(2);
        l.insertAtEnd(3);
        l.insertAtEnd(4);
        l.insertAtEnd(5);
        l.insertAtStart(0);
        l.insertAt(3, 45);
        l.display();
        
        
        
    }
    
}
