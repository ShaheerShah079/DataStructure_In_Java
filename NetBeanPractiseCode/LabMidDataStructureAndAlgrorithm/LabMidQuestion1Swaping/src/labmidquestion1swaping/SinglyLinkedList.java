package labmidquestion1swaping;

public class SinglyLinkedList
{
   Node head;
    Node tail;
    int size;

    SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }
    void insertAtEnd(int el) {
      Node n = new Node(el);
        if (isEmpty()) {
            head = n;
            tail = n;
            size++;
        } else {
            tail.next= n;
            tail = n;
            size++;
        }
    }
    void swap(){
        Node secondTemp=head.next;
        Node secondLastTemp=head;
        int tempSwap;

        for(int i=2;i<=size-1;i++)
        {
            secondLastTemp=secondLastTemp.next;
        }
        tempSwap=secondLastTemp.data;
        secondLastTemp.data=secondTemp.data;
        secondTemp.data=tempSwap;
    }
    void display(){
        Node p=head;
        for (int i = 1; i <=size; i++){
            System.out.print(p.data+"  ");
            p=p.next;
        }
        System.out.println("");
    }
}
