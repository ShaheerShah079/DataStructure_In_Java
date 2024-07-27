package labmidquestion1swaping;


public class LabMidQuestion1Swaping
{

    public static void main(String[] args)
    {
      SinglyLinkedList l = new SinglyLinkedList();
        l.insertAtEnd(2);
        l.insertAtEnd(6);
        l.insertAtEnd(8);
        l.insertAtEnd(7);
        l.insertAtEnd(1);
        System.out.println("Before swapping ");
        l.display();
        System.out.println("After swapping ");
        l.swap();
        l.display();
        
    }
    
}
