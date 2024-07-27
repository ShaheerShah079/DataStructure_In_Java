package labmidzakaullah;

public class Q4
{
    public static void main(String[] args)
    {
     SinglyLinkedList l = new SinglyLinkedList();
        l.insertAtStart(1);
        l.insertAtStart(2);
        l.insertAtStart(3);
        l.insertAtStart(4);
        
        System.out.println("Sum of all nodes is "+l.sum());
    }
    
}
class SinglyLinkedList{
    class Node
{
        private int data;
        private Node next;
        Node(int el){
            data =el;
            next = null;
        }

    }
     Node head;
     Node tail;
    int size;
    SinglyLinkedList(){
        head = null;
        tail=null;
        size=0;
    }
    boolean isEmpty(){
        return head==null;
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
    int sum(){
     Node p = head;
     int sum=0;
     while(p!=null){
         sum+=p.data;
         p=p.next;
     }
     return sum;
    }
}
 