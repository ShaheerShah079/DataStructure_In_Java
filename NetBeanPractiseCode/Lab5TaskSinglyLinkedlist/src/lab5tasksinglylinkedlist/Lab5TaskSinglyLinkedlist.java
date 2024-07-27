package lab5tasksinglylinkedlist;

public class Lab5TaskSinglyLinkedlist {
    public static void main(String[] args) {
        SinglyLinkedList l1 = new SinglyLinkedList();
        SinglyLinkedList l2 = new SinglyLinkedList();
        l1.insertAtStart(17);
        l1.insertAtStart(16);
        l1.insertAtStart(15);
        l1.insertAtStart(14);
        l1.insertAtStart(13);
        l1.insertAtStart(12);
        l1.insertAt(2,21);
        l1.insertAtEnd(18);
//        System.out.println(l.LinearSearch(1));
        l1.insertAfter(15,23);
        l1.display();
        System.out.println("Value deleted "+l1.deleteAT(5));
        System.out.println("Value deleted "+l1.deleteATStart());
        System.out.println("Value deleted "+l1.deleteATEnd());
        l1.display();

        System.out.println("Value deleted "+l1.deleteValue(16));
        l1.display();
        System.out.println("Length of List l1 "+l1.length());

        l1.copy(l2);
        System.out.println("Value deleted "+l1.deleteValue(13));
        l1.insertAfter(15,14);
        System.out.println("list l1 is ");
        l1.display();
        System.out.println("list l2 is ");
        l2.display();
        l1.clear();
        l1.display();
        l2.display();

    }
}
