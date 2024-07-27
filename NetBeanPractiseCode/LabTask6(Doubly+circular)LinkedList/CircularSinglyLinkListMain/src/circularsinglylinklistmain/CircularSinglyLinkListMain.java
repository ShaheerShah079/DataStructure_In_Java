package circularsinglylinklistmain;

public class CircularSinglyLinkListMain
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        CircularSinglyLinkList<Integer> l1 = new CircularSinglyLinkList<>();
        CircularSinglyLinkList<Integer> l2 = new CircularSinglyLinkList<>();
        l1.insertAtStart(1);
        l1.insertAtStart(2);
        l1.insertAtStart(3);
        l1.insertAtStart(4);
        l1.display();
        l1.insertAtEnd(5);
        l1.insertAt(2,8);
        l1.display();
        l1.insertAfter(2,9);
        l1.display();
        l1.deleteATEnd();
        l1.deleteATStart();
        l1.deleteAT(3);
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
