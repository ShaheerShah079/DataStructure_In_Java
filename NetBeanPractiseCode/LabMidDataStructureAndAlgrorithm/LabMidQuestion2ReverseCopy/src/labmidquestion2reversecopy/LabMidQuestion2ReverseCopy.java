package labmidquestion2reversecopy;

public class LabMidQuestion2ReverseCopy
{
    public static void main(String[] args)
    {
        SinglyLinkedList l1 = new SinglyLinkedList();
        SinglyLinkedList l2 = new SinglyLinkedList();
         l1.insertAtEnd(1);
        l1.insertAtEnd(2);
        l1.insertAtEnd(3);
        l1.insertAtEnd(4);
        l1.insertAtEnd(5);
        l1.copy_reverse(l2);
        System.out.println("First list");
        l1.display();
        System.out.println("Second list");
        l2.display();
        
    }
    
}
