
package labmidzakaullah;

public class Q3
{
    public static void main(String[] args)
    {
        DoublyLinkedList l = new DoublyLinkedList();
        l.insertAtstart(1);
        l.insertAtstart(2);
        l.insertAtstart(3);
        l.insertAtstart(4);
       
        if(l.countNode()%2==0){
            System.out.println("Number of nodes are even");
        }
        else{
            System.out.println("Number of nodes are odd");
        }
        
        
    }
    
}
class DoublyLinkedList {

    Node head;
    Node tail;
    int size;

    DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertAtstart(int item) {
        Node n = new Node(item);
        if (isEmpty()) {
            head = n;
            tail = n;
            size++;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
            size++;
        }
    }
    
    int countNode(){
        Node p = head;
        int count=0;
        while(p!=null){
            count+=1;
            p=p.next;
        }
        return count;
    }
    
}
class Node {
    int data;
    Node prev;
    Node next;

    Node(int item) {
        data = item;
        prev = null;
        next = null;
    }
}
