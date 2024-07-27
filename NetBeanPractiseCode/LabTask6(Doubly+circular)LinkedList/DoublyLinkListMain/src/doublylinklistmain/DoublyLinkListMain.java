package doublylinklistmain;


public class DoublyLinkListMain
{

  
    public static void main(String[] args)
    {
        // TODO code application logic here
        DoublyLinkedList<Integer> l1 = new DoublyLinkedList<>();
          DoublyLinkedList<Integer> l2 = new DoublyLinkedList<>();
          l1.insertAtstart(1);
          l1.insertAtstart(2);
          l1.insertAtstart(3);
        l1.insertAtstart(4);
        l1.display();
        l1.insertAtEnd(5);
        l1.insertAt(2,8);
        l1.display();
        l1.insertAfter(2,9);
        l1.display();
        l1.deleteAtEnd();
        l1.deleteAtStart();
        l1.deleteAt(3);
        l1.display();
        l1.deleteValue(9);
        l1.display();
        System.out.println("Length of list l1 is "+l1.length());
        l1.copy(l2);
        System.out.print("List l2 :");
        l2.display();
        System.out.print("List l1 :");
        l1.display();
    }
    
}
