package labmidquestion2reversecopy;

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
    void insertAtStart(int el){
       Node n = new Node(el);
        if(isEmpty()){
            head=n;
            tail=n;
            size++;
        }
        else{
            n.next=head;
            head=n;
            size++;
        }
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
    void display(){
        Node p=head;
        for (int i = 1; i <=size; i++){
            System.out.print(p.data+"  ");
            p=p.next;
        }
        System.out.println("");
    }

    void copy_reverse(SinglyLinkedList newList){
        Node p=head;
        for (int i = 1; i <=size; i++) {
            newList.insertAtStart(p.data);
            p=p.next;
        }
        System.out.println("List copied!!!!!!");
    }  
}
